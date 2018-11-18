package contracts;

public interface IObserver {

    //take action when an update occurs
    void update();

    //Define the observable to listen
    void setObservable(IObservable obj);
}
