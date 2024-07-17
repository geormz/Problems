public class Reverse {
    


    public static void reverseS(char[] s){
      
        char[] r= new char[s.length];
        for(int i=0; i<s.length; i++){
            r[i]=s[s.length-1-i];
        }
        
        
        for(char n : r){
            System.out.print(n);
        }
    }


    public static void main(String[] args) {
        char[] cad={'h','e','l','l', 'o'};
        reverseS(cad);

    }
}
