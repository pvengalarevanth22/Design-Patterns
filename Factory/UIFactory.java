import Components.Button.Button;
import Components.Dropdown.Dropdown;
import Components.Menu.Menu;

//Interface containing all Factory methods
public interface UIFactory {
    Menu createMenu();
    Button createButton();
    Dropdown CreateDropdown();

}
