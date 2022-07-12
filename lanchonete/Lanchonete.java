/**
 * Este projeto constitui da criação de uma abstract class
 * utilização de um builder para manipular pedidos de uma lanchonete
 * no cardapio tem pizza e pastel, ambos contendo os sabores e seus tamanhos
 */
package lanchonete;

/**
 *
 * @author Filipe
 */
public class Lanchonete {

    public static void main(String[] args) {
      Pastel p1 = new Pastel.Builder(Pastel.Tamanho.GRANDE).addSabor(Sabores.Sabor.CEBOLA).addSabor(Sabores.Sabor.CALABRESA).build();
    }
    
}
