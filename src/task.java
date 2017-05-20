public class task
{
    public static void main (String[] args)
    {
        int table [][];
        table = new int [6][2];
        
        for (int i=0;i<6;i++)
        {
            for(int j=0;j<2;j++)
            {
                table [i][j] = (int) (Math.random()*50);
            }
        }
        
        for (int i=0;i<6;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}