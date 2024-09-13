//Decorator design pattern
//1.This design pattern is used when there is need of wrapping features one over the other.
//2.In this pattern when will create interface for the methods for the required features.
//3.Implement the above interface to for each item.
public class Client {
    public static void main(String[] args) {

        //Add several features with base feature cone and then added toppings.
        IceCream iceCream=new Chips(
                            new VanillaScoop(
                                new RedVelvetScoop(new OrangeCone(
                                    new ChocoSyrup(
                                        new OrangeCone()
                                        )
                                    )
                                )
                            )
                        );
        System.out.println("Total icecream cost : "+iceCream.cost());
        System.out.println("Total icecream Description : "+iceCream.desc());
    }
}
