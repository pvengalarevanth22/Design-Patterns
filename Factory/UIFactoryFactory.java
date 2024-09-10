public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatforms supportedPlatforms){
        if(supportedPlatforms==SupportedPlatforms.IOS){
            return new IosUIFactory();
        }
        else if(supportedPlatforms==SupportedPlatforms.ANDROID){
            return  new AndroidUIFactory();
        }
        return null;
    }
}
