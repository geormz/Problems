import java.util.Arrays;

public class Mediana {
    

    public static double findMediana(int[] nums1, int[] nums2){

        //unir dos matricrz int 
        int[] combinedArray= new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);
        //ordenarlos

        Arrays.sort(combinedArray);
        
        int size=combinedArray.length;

        return (size%2==0)? (combinedArray[size /2 -1] + combinedArray[size /2]) /2.0: combinedArray[size/2];


    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        
        System.out.println(findMediana(array1, array2));
       
    }
}
