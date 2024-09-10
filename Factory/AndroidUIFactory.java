import Components.Button.AndroidButton;

import Components.Dropdown.AndroidDropdown;

import Components.Menu.AndroidMenu;

//Android Ui Factory implementing all UIFactory methods
public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropdown CreateDropdown() {
        return new AndroidDropdown();
    }
}
