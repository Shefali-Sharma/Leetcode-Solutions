import java.util.HashMap;

public class PlusOne_OptimizedExample{
    public static void main(String[] args){
        
        
    }
    
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        for(int i = n - 1; i>=0; i--){
            
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newdig = new int[n + 1];
        newdig[0] = 1;                 //Assuming all the digits are 9 - therefore [0] = 1, and rest all = 0s
        
        return newdig;
    }
    
}
