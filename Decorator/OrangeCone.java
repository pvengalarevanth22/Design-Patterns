//Since this is the base feature we need create the both default and parameterized constructor.
public class OrangeCone implements IceCream{
    private IceCream iceCream;
    public OrangeCone(){

    }
    public  OrangeCone(IceCream iceCream){
        this.iceCream=iceCream;
    }

    //Cost of the previous feature + cost of the orange cone.
    @Override
    public int cost() {
        if(iceCream!=null){
            return iceCream.cost()+10;
        }
        return 10;
    }

    //Cost of the previous feature + cost of the orange description.
    @Override
    public String desc() {
        if(iceCream!=null){
            return iceCream.desc()+"Orange cone, ";
        }
        return "Orange cone, ";
    }
}
