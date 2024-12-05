package Factories;

import Checkbox.Checkbox;
import buttons.Button;

/**
 * A f�brica abstrata conhece todos os tipos de produtos (abstratos).
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}