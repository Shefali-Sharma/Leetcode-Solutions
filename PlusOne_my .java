import java.util.HashMap;

public class PlusOneExample{
    public static void main(String[] args){
        
        
    }
    
    public int[] plusOne(int[] digits) {
        int carry = 0, sum = 0;
        
        sum = digits[digits.length - 1] + 1;
        carry = 1;
        for(int i = digits.length - 2; i>=0; i--){
            carry = 0;
            if(sum == 10){
                digits[i+1] = 0;
                carry = 1;
            }
            else{
                digits[i+1] = sum;
                break;
            }
            sum = digits[i] + carry;
        }
        
        //System.out.println(carry);
        if(carry == 0 && digits.length==1 && sum!=10){
            digits[0] = sum;
        }
        else if(carry == 1){
            if(sum==10){
                int[] newdig = new int[digits.length + 1];
                newdig[0] = 1;
                newdig[1] = 0;
                System.arraycopy( digits, 1, newdig, 1, digits.length -1 );
                return newdig;
            }else{
                digits[0] = sum;
            }
        }
        
        return digits;
    }
    
}
