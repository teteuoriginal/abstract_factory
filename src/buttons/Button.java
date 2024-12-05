package buttons;

/**
* Abstract Factory pressup�e que voc� tenha diversas fam�lias de produtos,
  * estruturado em hierarquias de classes separadas (Bot�o/Caixa de sele��o). Todos os produtos de
  * a mesma fam�lia possui interface comum.
  *
  * Esta � a interface comum para a fam�lia de bot�es.
 */
public interface Button {
    void paint();
}