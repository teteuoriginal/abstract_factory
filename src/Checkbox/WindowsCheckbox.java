package Checkbox;

/**
* Todas as fam�lias de produtos possuem as mesmas variedades (MacOS/Windows).
  *
  * Esta � outra variante de uma caixa de sele��o.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}