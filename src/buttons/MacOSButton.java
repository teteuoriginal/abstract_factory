package buttons;

/**
* Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
  *
  * Esta é uma variante MacOS de um botão.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}