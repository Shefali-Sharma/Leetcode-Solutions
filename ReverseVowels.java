import java.util.HashMap;

public class reverseVowelsClass{
    public static void main(String[] args){
        
        
    }
    
    public String reverseVowels(String str) {
        
        char[] chars = str.toCharArray();
        String vowels = "AEIOUaeiou";
        
        for(int i = 0, j=str.length() -1; i<j;){
            
            while(!vowels.contains(chars[i] + "") && i<j){
                i++;
            }
            while(!vowels.contains(chars[j] + "") && i<j){
                j--;
            }
            
            if(i<j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            i++; j--;
        }
        
        return new String(chars);
    }
    
    
}
