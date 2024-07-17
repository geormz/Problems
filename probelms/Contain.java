
import java.util.HashMap;
import java.util.HashSet;

public class Contain{

public static void main(String[] args) {
    int[] n={1,2,3,1};
    int k=3;
    //System.out.println(con(n));
    System.out.println(conTwo(n, k));
}


public static boolean con(int[]nums){
   HashSet<Integer> set= new HashSet<>();
    for(int num: nums){
        if(!set.add(num)){
            return true;
        }
    }
   

    return false;
}

public static boolean conTwo(int[]nums, int k){
   HashMap<Integer, Integer> map = new HashMap<>();

   for(int i=0; i<nums.length; i++){
    if(map.containsKey(nums[i])){
        int pre= map.get(nums[i]);
        if(i-pre<=k){
            return true;
        }
    }
    map.put(nums[i], i);

   }


    return false;
}


}