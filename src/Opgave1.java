class Opgave1
{
    public static void main ( String[] args )
    {
        int[] val = {0, 1, 2, 3,5,1337};
        int sum =0;

        for (int thingie:val){
            sum+=thingie;
        }
                System.out.println( "Sum of all numbers = " + sum);
    }
}