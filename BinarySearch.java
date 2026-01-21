public class BinarySearch
{
    public static int binarySearch(int num[], int key)
    {
        int start = 0, end = num.length-1;
        
        while (start <= end) 
        {

            int mid = (start+end)/2;
            
            if(num[mid] == key) //element found wali condition 
            {
                return mid;
            }  else if (num[mid] < key) // element is in right half
            {
                start = mid + 1;
            } else                     // element is in left half                  
            {
                end = mid - 1 ;
            }
        }
        return -1; // element not found
    }
    
    public static void main(String[] args) 
    {
        int number[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};    

        int value = binarySearch(number, 38);

        if (value == -1) 
        {
            System.out.println("Element not found in the array");
        } else 
        {
            System.out.println("Element found at index: " + value);
        }
    }


}
