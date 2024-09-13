public class RedVelvetScoop implements IceCream{
    private IceCream iceCream;
    public RedVelvetScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int cost() {
        return iceCream.cost()+30;
    }

    @Override
    public String desc() {
        return iceCream.desc()+"Red velvet scoop, ";
    }
}
