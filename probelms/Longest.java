public class Longest{

    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(lon(strs)); 
    }

    public static String lon(String[] strs){
        String c=strs[0];    
        for(int i=1; i<strs.length; i++){
          while (strs[i].indexOf(c)!=0){
            c=c.substring(0,c.length()-1);
            if(c.isEmpty()) return "";
          }

        }

    
        return c;
    }
}