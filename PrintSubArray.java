public class PrintSubArray 
{
    public static void printSubArray(int num[])
    {
        int ts=0; // total subarrays
        for(int i =0; i<num.length; i++)
        {   //starting index, starting with 0 that is 2 
            int start = i;
            for(int j = i; j<num.length; j++)
            {   //this is the ending index value 
                int end = j;
                for(int k=start; k<=end ; k++)
                {
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+ts);        
    }
    public static void main(String[] args) 
    {
        int number[] = {2, 4, 6, 8, 10};
        printSubArray(number);
    }    
}
