//O objetivo dessa classe é como o nome já diz, criar métodos que sejam para utilidade

package noninstability;

/**
 *
 * @author Filipe
 */
public class Utility {
    
    private Utility(){
        throw new AssertionError("não foi possivel");
    }
    //Exemplo de utility method
    
    public static boolean nullSafeStringEquals(String s1, String s2){
        return s1 == null ? s2 == null : s1.equals(s2);
                }
}
