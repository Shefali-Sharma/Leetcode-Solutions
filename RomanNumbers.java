import java.util.HashMap;

public class RomanToInteger{
    public static void main(String[] args){
        
        
    }
    
    public int romanToInt(String s) {
        HashMap <Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
            
        int sum = 0;
        int i = 0;
        for(; i<s.length()-1; i++){
            if(romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i+1))){
                sum = sum + romanMap.get(s.charAt(i));
            }else{
                sum = sum - romanMap.get(s.charAt(i));
            }
        }
        sum = sum + romanMap.get(s.charAt(i));
            
        return sum;
    }
    
}
