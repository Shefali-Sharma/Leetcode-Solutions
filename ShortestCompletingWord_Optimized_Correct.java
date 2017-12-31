import java.util.HashMap;

public class ShortestCompletingWord_Correct{
    public static void main(String[] args){
        
        
    }
    
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        int[] target = myCount(licensePlate);
        String ans = "";
        
        for(String word : words){
            if(((word.length() < ans.length()) || (ans.length() == 0)) && (hasWord(myCount(word), target))){
                ans = word;
            }
        }
        
        return ans;
    }
    
    public boolean hasWord(int[] count1, int[] count2){
        for(int i = 0; i<26; i++){
            if(count1[i]<count2[i]){
                return false;
            }
        }
        
        return true;
    }
    
    public int[] myCount(String licensePlate){
        
        int[] ans = new int[26];
        
        for(char letter : licensePlate.toCharArray()){
            int index = Character.toLowerCase(letter) - 'a';
            if(0 <= index && index < 26){
                ans[index]++;
            }
        }
        
        return ans;
    }
    
}
