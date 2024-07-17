public class PlusOne {

    public static void main(String[] args) {
        int[] n={9};
        int[] r=pO(n);

        for(int res:r){
            System.out.println(res);
        }
        
    }



    public static int[] pO(int [] digits){
        
        for(int i= digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] newDigit= new int[digits.length+1];
        newDigit[0]=1;
        
        return newDigit;        
    }
}
