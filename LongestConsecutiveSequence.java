import java.util.HashMap;

public class LongestConsecutiveSequence_Optimized{
    public static void main(String[] args){
        
        
    }
    
    public int longestConsecutive(int[] nums) {
        
        HashMap <Integer, Integer>hm = new HashMap<Integer, Integer>();
        
        int len = 0;
        for(int n : nums){
            if(!map.containsKey(n)){
                int left = map.containsKey(n-1)?map.get(n-1):0;
                int right = map.containsKey(n+1)?map.get(n+1):0;
                int sum = left + right + 1;
                
                map.put(n, sum);
                map.put(n-left, sum);
                map.put(n+right, sum);
                
                len = Math.max(len, sum);
            }
            
        }
        
        
        return len;
    }
    
    
}
