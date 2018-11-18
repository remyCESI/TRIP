package contracts;

public interface IObservable {

    //method to register and unregister observers
    void register(IObserver obj);
    void unregister(IObserver obj);

    //Notify observers when change occurs on observable
    void notifyObservers();

    //Get update from observable
    Object getUpdate(IObserver obj);
}
