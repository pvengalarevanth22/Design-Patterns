//Since this is not the base feature we should not be able to add feature as base.
//So we create only parameterized constructor.
public class VanillaScoop implements IceCream{
    private IceCream iceCream;
    public VanillaScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int cost() {
        return iceCream.cost()+25;
    }

    @Override
    public String desc() {
        return iceCream.desc()+"Vanilla Scoop, ";
    }
}
