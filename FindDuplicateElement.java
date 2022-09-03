import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of n elements that contains elements from 0 to
 *  n-1, with any of these numbers appearing any number of times.
 *  Find these repeating numbers in O(n) and using only constant
 *  memory space.
 */
public class FindDuplicateElement{
    
    public static void duplicateElement(int arr[], int n){
     Set<Integer> uniqueElements = new HashSet<>();
     boolean isDuplicate = false;

     for(int i =0; i<n ; i++){
        if(uniqueElements.contains(arr[i])){
            isDuplicate = true;
            System.out.print(arr[i]+",");
        }
        else{
            uniqueElements.add(arr[i]);
        }
     }

     if(!isDuplicate){
        System.out.println(-1);
     }
    }
    //Driver code : 
    public static void main(String[] args) {
        int arr[] = {1,3,3,4,5,6,5,3,2,9};
       duplicateElement(arr, 10);
    }
}