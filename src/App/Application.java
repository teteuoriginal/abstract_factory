package App;

import Checkbox.Checkbox;
import Factories.GUIFactory;
import buttons.Button;

/**
 * Os usu�rios da f�brica n�o se importam com qual f�brica de concreto eles usam, pois trabalham com
  * f�bricas e produtos atrav�s de interfaces abstratas.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}