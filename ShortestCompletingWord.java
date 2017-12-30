import java.util.HashMap;

public class ShortestCompletingWord{
    public static void main(String[] args){
        
        
    }
    
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        Integer numLetters = getCount(licensePlate);
        int minLen = words[0].length();
        String res = "";
        int flag = 0;
        
        for(int i = 0; i<words.length; i++){
            if(numLetters <= words[i].length()){
                if(CheckIfLetterExist(licensePlate, words[i]) == 1){
                    if(minLen < words[i].length() || i==0 || flag == 0){
                        minLen = words[i].length();
                        res = words[i];
                        flag = 1;
                    }
                }
            }
        }
        
        return res;
        
    }
    
    public Integer getCount(String str){
        
        Integer count = 0;
        for(int i = 0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                count++;
            }
        }
        
        return count;
    }
    
    public int CheckIfLetterExist(String licensePlate, String word1){
        
        StringBuilder word = new StringBuilder(word1.toLowerCase());
        
        for(int i = 0; i < licensePlate.length(); i++){
            if(Character.isLetter(licensePlate.charAt(i))){
                
                char ch = Character.toLowerCase(licensePlate.charAt(i));
                //System.out.println(ch);
                
                int index = word.toString().indexOf(ch);
                //System.out.println(index);
                
                if( index == -1){
                    return 0;
                }
                //System.out.println(word);
                word.setCharAt(index, '0');
            }
        }
        
        return 1;
    }
    
}
