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



    }
    public static boolean meh(String n){
        if (n.length()==0) return true;
        if (n.substring(0, 1) == "a") {
            return meh(n.substring(1));
        }
        if (n.substring(0, 1) == "t") {
            return meh(n.substring(1));
        }
        if (n.substring(0, 1) == "c") {
            return meh(n.substring(1));
        }
        if (n.substring(0, 1) == "g") {
            return meh(n.substring(1));
        }
        else return false;





    }
}
