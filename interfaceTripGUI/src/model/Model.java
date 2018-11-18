package model;

import contracts.IObservable;
import contracts.IObserver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Model implements IObservable {

    private int cptCup;
    private boolean changed;

    //Lists of currents observers
    private List<IObserver> observers;

    //MUTEX to protect observers lists access
    private final Object MUTEX = new Object();

    public Model(){
        this.observers = new ArrayList<>();
        this.initCounter();

        EngineCom engine = EngineCom.getInstance(this);
        engine.start();
    }

    synchronized public void addCup(){
        this.cptCup += 1;
        System.out.println(cptCup);
        this.changed = true;
        this.notifyObservers();
        this.saveCounter();
    }

    private void initCounter() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("result.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                cptCup = Integer.parseInt(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            this.cptCup = 0;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Save the counter in a txt file
    synchronized private void saveCounter(){

        Runnable save = () -> {
            try {
                File ff = new File("result.txt");
                ff.createNewFile();
                FileWriter ffw = new FileWriter(ff);
                ffw.write(Integer.toString(cptCup));
                ffw.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        };
        Thread saveTask = new Thread(save);
        saveTask.start();

    }

    @Override
    public void register(IObserver obj) {
        if(obj == null) throw new NullPointerException("Null observer");

        synchronized (MUTEX){
            if(!observers.contains(obj)){
                observers.add(obj);
            }
        }
    }

    @Override
    public void unregister(IObserver obj) {
        synchronized (MUTEX){
            if(!observers.contains(obj)){
                observers.remove(obj);
            }
        }
    }

    @Override
    public void notifyObservers() {
        List<IObserver> observerLocal = null;

        //Synchronised ensure that a recently added observer receive the last update
        synchronized (MUTEX){
            if(!changed){
                return;
            }
            else {
                observerLocal = observers;
                this.changed = false;
            }
        }

        for(IObserver obj : observerLocal){
            obj.update();
        }
    }

    @Override
    public Object getUpdate(IObserver obj) {
        return this.cptCup;
    }
}
