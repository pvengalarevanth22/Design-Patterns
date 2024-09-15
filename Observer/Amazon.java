//Observer Design Pattern :
//Why? If there are several things to done based on event happened.(Several classes has to be executed when an event occurs)
//Solution:
//Consider the class in which event occurred as "publisher" ex:Amazon class.
//Consider the class as "subscriber" that has to notified when an event occurs.
//Create a method in "publisher" to register classes that has to be executed when an event occurs.
//Create an interface for that event and implement them in different classes that has to be executed.

import java.util.ArrayList;
import java.util.List;
public class Amazon {
    //List that stores the list of classes that has to be executed when order placed event is executed.
    private List<OrderPlacedSubscription> orderPlacedSubscriptionList=new ArrayList<>();
    private List<OrderCancelledSubscription> orderCancelledSubscriptions=new ArrayList<>();

    //Method to register
    public void registerOrderPlacedSubscription(OrderPlacedSubscription orderPlacedSubscription){
        orderPlacedSubscriptionList.add(orderPlacedSubscription);
    }

    public void deRegisterOrderPlacedSubscription(OrderPlacedSubscription orderPlacedSubscription){
        orderPlacedSubscriptionList.remove(orderPlacedSubscription);
    }

    public void registerOrderCancelledSubscription(OrderCancelledSubscription orderCancelledSubscription){
        orderCancelledSubscriptions.add(orderCancelledSubscription);
    }

    public void deRegisterOrderCancelledSubscription(OrderCancelledSubscription orderCancelledSubscription){
        orderCancelledSubscriptions.remove(orderCancelledSubscription);
    }

    //Main event when called it executes the list of classes.
    public void orderPlaced(){
        for(OrderPlacedSubscription ors:orderPlacedSubscriptionList){
            ors.orderPlaced();
        }
    }
    public void orderCanceled(){
        for(OrderCancelledSubscription ocs:orderCancelledSubscriptions){
            ocs.orderCancelled();
        }
    }
}
