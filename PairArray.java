public class PairArray 
{
    public static void pairArray(int num[])
    {
        int tp =0; // total pairs
        for (int i =0;i <num.length;i++)
        {
            int cur = num[i];//2,6,8,6,12,15,18,20
            for (int j =i+1; j< num.length; j++)
            {
                System.out.print("(" + cur + "," + num[j] + ") ");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total pairs: " + tp);
    }
    public static void main(String[] args) 
    {
        int number[] = {2, 4, 6, 8, 10};
        pairArray(number);
    }    
}
