import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by richard on 11/20/15.
 */
public class Analyse
{
    private String inhoud;
    private String file = "/home/richard/Documents/Lysanne/Homo_sapiens.gene_info";
    private static BufferedReader readloop;
    private List<Gen> arl = new ArrayList<>();

    public static void main(String[] args)
    {
        Analyse a1 = new Analyse();
        a1.check();
    }

    public void check()
    {                                               //objecten hebben als private attribuut gene_id, symbol en chromosome_map_location.
                                                    //Creëer ook de bijbehorende getters en setters voor deze attributen

        try
        {
            readloop = new BufferedReader(new FileReader(file));
            for (int i=0; i<20; i++)
            {
                String line1 = readloop.readLine();
                if (i>0)
                {
                    //System.out.println(line1);
                    String[] arr1 = line1.split("\t");
                    String gene_id = arr1[1];
                    String symbol = arr1[2];
                    String locus = arr1[7];
                    //System.out.println("\ngene_id:    "+gene_id);
                    //System.out.println("symbol:     "+symbol);
                    //System.out.println("locus:      "+locus);
                    String[] arr2 = new String[3];
                    arr2[0] = gene_id;
                    arr2[1] = symbol;
                    arr2[2] = locus;

                    arl.add(new Gen(arr2));
                }

            }

        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println(arl);
            arl.sort(null);
            System.out.println(arl);
        }
    }
}