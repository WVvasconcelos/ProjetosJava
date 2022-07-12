/*
O objetivo desse projeto é criar um private constructor, para impedir uma
determinada classe ser instânciada.
 */
package noninstability;

/**
 *
 * @author Filipe
 */
public class NonInstability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String b = null;
        String k = null;
        
        
        //O objeto criado abaixo ele seria possivel, com a ausencia de um construtor privado na classe Utility
        //entretanto seria um gasto desnecessário de memoria, já que a classe Utility é uma classe de utilizades.
        
        Utility util = new Utility();
        
        System.out.println(util.nullSafeStringEquals(b, k));
        
        
        //por ser uma classe de utilidade tudo que necessitamos fazer é invocar ela
        System.out.println(Utility.nullSafeStringEquals(b, k));
    }
    
}
