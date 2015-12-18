import java.util.Scanner;

/**
 * Created by richard on 12/11/15.
 */
public class RecursiefDNAcheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter DNA Dawg!!!!!");
        String n = reader.next();
        System.out.println(n);
        Boolean result = meh(n);
        System.out.println(result);
        if (result == true){
            System.out.println("THIS IS DNA ERMAGHERRRRDRRRDRDRDRDRRRRRRd!!!");
        }
        if (result == false){
            System.out.println("This aint DNA dawg!!!");
        }



    }
    public static boolean meh(String n){
        if (n.length()==0) return true;
        if (n.substring(0, 1) .equals("a")) {
            return meh(n.substring(1));
        }
        if (n.substring(0, 1)  .equals("t")) {
            return meh(n.substring(1));
        }
        if (n.substring(0, 1) .equals("c")) {
            return meh(n.substring(1));
        }
        if (n.substring(0, 1) .equals("g")) {
            return meh(n.substring(1));
        }
        else return false;





    }
}
