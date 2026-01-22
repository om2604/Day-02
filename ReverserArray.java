public class ReverserArray
{
    public static void reverseArray(int num[])
    {
        int start =0, end = num.length - 1;

        while (start < end)
        {
            //swap start with end 
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;  
        }
    }
    public static void main(String[] args) 
    {
        int number[] = {2, 6, 8, 6, 12, 15, 18, 20};  
       
       
        reverseArray(number);// As array is passed by reference so changes made in function will reflect here
        
        //priting reversed array
        for (int i = 0; i < number.length; i++) 
        {
            System.out.print(number[i] + " ");
        }
    }    
}
