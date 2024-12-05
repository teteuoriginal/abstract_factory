package Factories;

import Checkbox.Checkbox;
import Checkbox.WindowsCheckbox;
import buttons.Button;
import buttons.WindowsButton;

/**
 *Cada f�brica de concreto amplia a f�brica b�sica e � respons�vel pela cria��o
  *produtos de uma �nica variedade.
 */
public class WindowsFactory implements GUIFactory {
	
	

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

 
}
