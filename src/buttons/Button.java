package buttons;

/**
* Abstract Factory pressupõe que você tenha diversas famílias de produtos,
  * estruturado em hierarquias de classes separadas (Botão/Caixa de seleção). Todos os produtos de
  * a mesma família possui interface comum.
  *
  * Esta é a interface comum para a família de botões.
 */
public interface Button {
    void paint();
}