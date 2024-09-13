public class Chips implements IceCream{
    private IceCream iceCream;
    public Chips(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int cost() {
        return iceCream.cost()+5;
    }

    @Override
    public String desc() {
        return iceCream.desc()+"Chips added, ";
    }
}
