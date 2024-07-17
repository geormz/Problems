public class Palindromo {
    public static boolean isP(String str){
        int left=0;
        int rigth= str.length()-1;


        while(left<rigth){
            if(str.charAt(left) !=str.charAt(rigth)){
                return false;
            }
            left ++;
            rigth --;
        }
        return true;
    }

    public static boolean ispalin(String cad){
        
        int n=cad.length();
        for(int i=0; i<n/2; i++){
            if(cad.charAt(i)!= cad.charAt(n-1-i)){
                return false;
            }
            
        }

        return true;
    }


    public static boolean ispa(String cad){
        String cleanedCad = cad.replaceAll("^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleanedCad);
        
        int n = cleanedCad.length();
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;  
            if (cleanedCad.charAt(i) != cleanedCad.charAt(j)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome(String s) {
        // Limpiar la cadena eliminando caracteres no alfanuméricos y convirtiendo a minúsculas
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Obtener el reverso de la cadena
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        
        // Verificar si la cadena limpia es igual a su reverso
        return cleanedString.equals(reversedString);
    }


    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
        /*System.out.println("Is '" + word + "' a palindrome? " + isP(word));
        System.out.println("Is '" + word + "' a palindrome? " + ispalin(word));*/
        //System.out.println("Is '" + word + "' a palindrome? " + ispa(word));
        System.out.println(isPalindrome(word));
    }

}
