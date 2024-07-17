import java.util.Arrays;

public class Merge {
       
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3; // Número de elementos válidos en nums1
        int[] nums2 = {2, 5, 6};
        int n = 3; // Número de elementos en nums2

        merg(nums1, m, nums2, n);

        // Imprimir el resultado
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; 
        int j = 0; 
        int k = 0; 

        
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);

       
        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[k++] = temp[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

      
        while (i < m) {
            nums1[k++] = temp[i++];
        }

      
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }

    public static void merg(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

}
