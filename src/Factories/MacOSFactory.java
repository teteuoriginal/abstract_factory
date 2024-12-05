package Factories;

import Checkbox.Checkbox;
import Checkbox.MacOSCheckbox;
import buttons.Button;
import buttons.MacOSButton;

/**
 *Cada f�brica de concreto amplia a f�brica b�sica e � respons�vel pela cria��o
  *produtos de uma �nica variedade.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}