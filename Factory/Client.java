import Components.Button.Button;
import Components.Dropdown.Dropdown;
import Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        //Client only needs to change in below line for changing platform.
        Flutter flutter=new Flutter(SupportedPlatforms.IOS);
        UIFactory uiFactory=flutter.createFactory();

        Button button=uiFactory.createButton();
        button.changeButton();

        Menu menu= uiFactory.createMenu();
        menu.changeMenu();

        Dropdown dropdown= uiFactory.CreateDropdown();
        dropdown.changeDropdown();
    }
}
