//Factory Design Pattern
//1.Factory Method: return different object based on specific criteria
//2.Abstract Factory : Segregate classes based on common methods and factory methods
//3.Practical Factory : Return object of the same class.
public class Flutter {
    private SupportedPlatforms supportedPlatforms;
    Flutter(SupportedPlatforms supportedPlatforms){
        this.supportedPlatforms=supportedPlatforms;
    }

    //Common Methods
    public void setColor(){
        System.out.println("Set new color");
    }
    public void setTheme(){
        System.out.println("Set out new theme");
    }

    //Practical Factory : create object to access the factory method based on the platform
    public UIFactory createFactory(){
       return UIFactoryFactory.createUIFactory(this.supportedPlatforms);
    }
}
