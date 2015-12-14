/**
 * Created by richard on 12/11/15.
 */
import java.util.*;

public class programmeeropdracht2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter DNA Dawg!!!!!");
        String n = reader.next();
        System.out.println(n);
        int l = n.length();
        for (int i = 0; i < l; i++) {
            if (n.charAt(i)=='a' || n.charAt(i)=='t' || n.charAt(i)=='c' || n.charAt(i)=='g' ){
                System.out.println("ITS LEGIT!");
            }else{
                System.out.println("naaaah its all wrong!");
            }

        }

    }
}

