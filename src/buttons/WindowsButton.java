package buttons;

/**
* Todas as fam�lias de produtos possuem as mesmas variedades (MacOS/Windows).
  *
  * Esta � outra variante de um bot�o.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
