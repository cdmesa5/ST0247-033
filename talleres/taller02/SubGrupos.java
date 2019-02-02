
/**
 * Write a description of class SubGrupos here.
 *
 * @author (Carlos)
 * @version (a version number or a date)
 */
public class SubGrupos
{
    public static void subgroup(String s) {
        subgroupAux("",s);
    }
    
    public static void subgroupAux(String ans, String nLetras){
        if (nLetras.length() == 0)
            System.out.println(ans);
        else {
            subgroupAux(ans, nLetras.substring(1));
            subgroupAux(ans + nLetras.substring(0,1), nLetras.substring(1));
        } 
    }
}
