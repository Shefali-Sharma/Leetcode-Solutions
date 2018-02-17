import java.util.HashMap;

public class TrappingRainWater_Optimized{
    public static void main(String[] args){
        
        
    }
    
    public int trap(int[] height) {
        int maxleft = 0, maxright = 0;
        int left = 0, right = height.length - 1;
        int amt = 0;
        
        while(left <= right){
            if(A[left] <= A[right]){
                if(A[left] >= maxleft) {
                    maxleft = A[left];
                }
                else{
                    amt += maxleft - A[left];
                }
                left++;
            }
            else{
                if(A[right] >= maxright){
                    maxright = A[right];
                }
                else{
                    amt += maxrightz - A[right];
                }
                right--;
            }
        }
        
        return amt;
    }
    
    
}
