public class Asterisks {
    

    public static void main(String[] args) {
        System.out.println(countAs("*||*|||||*|*|***||*||***|"));
        
    }



    public static int countAs(String s){
        int m = 0;
        char item = '*';
        boolean insideBars = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                insideBars = !insideBars;  
            } else if (!insideBars && s.charAt(i) == item) {
                m++;
            }
        }
        
        return m;

    }
}
