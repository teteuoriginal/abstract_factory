package buttons;

/**
* Todas as fam�lias de produtos possuem as mesmas variedades (MacOS/Windows).
  *
  * Esta � uma variante MacOS de um bot�o.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}