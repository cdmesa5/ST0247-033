
/**
 * Write a description of class Permutando here.
 *
 * @author (Carlos)
 * @version (a version number or a date)
 */
public class Permutando extends AdvancedEncryptionStandard
{
    public static void permutar(String CadenaDeCaracteres) {
        permutarAux("",CadenaDeCaracteres);
    }
    public static void permutarAux(String resp, String preg){
        if (preg.length() == 0) {
            System.out.println(resp);
            desencriptarArchivo(resp);
        }
        if (preg.length() != 0) {
           for (int i = 0; i < preg.length(); i++) {
             permutarAux(resp + preg.charAt(i), preg.substring(0,i) + preg.substring(i+1));
             desencriptarArchivo(resp);
           }
        }
    }
}
