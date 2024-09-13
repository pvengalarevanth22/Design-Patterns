public class ChocolateCone implements IceCream{
    private IceCream iceCream;
    public ChocolateCone(){

    }
    public ChocolateCone(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int cost() {
        if(iceCream!=null){
            return iceCream.cost()+15;
        }
        return 15;
    }

    @Override
    public String desc() {
        if(iceCream!=null){
            return iceCream.desc()+"Chocolate cone, ";
        }
        return "Chocolate cone";
    }
}
