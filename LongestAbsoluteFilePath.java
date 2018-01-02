import java.util.HashMap;

public class LongestAbsoluteFilePathClass{
    public static void main(String[] args){
        
        
    }
    
    public int lengthLongestPath(String input) {
        
        String[] paths = input.split("\n");
        int[] levels = new int[paths.length + 1];
        
        int max = 0;
        for(String path: paths){
            int lev = path.lastIndexOf('\t') + 1;
            
            int curr = levels[lev + 1] = path.length() + 1 + levels[lev] - lev;
            
            if(path.contains(".")){
                max = Math.max(max, curr - 1);
            }
            
        }
        
        return max;
    }
    
}
