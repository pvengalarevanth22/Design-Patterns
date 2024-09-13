public class ChocoSyrup implements IceCream{
    private IceCream iceCream;
    public ChocoSyrup(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int cost() {
        return iceCream.cost()+5;
    }

    @Override
    public String desc() {
        return iceCream.desc()+" Chocolate syrup, ";
    }
}
