
import Components.Button.IosButton;
import Components.Dropdown.IosDropdown;
import Components.Menu.IosMenu;

//IOS Ui Factory implementing all UIFactory methods
public class IosUIFactory implements UIFactory{
    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosDropdown CreateDropdown() {
        return new IosDropdown();
    }
}
