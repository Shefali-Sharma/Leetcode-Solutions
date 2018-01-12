import java.util.HashMap;

public class StrobogrammaticNumberExample{
    public static void main(String[] args){
        
        
    }
    
    public boolean isStrobogrammatic(String num) {
        if(num.length() < 1){
            return true;
        }
        
        if(num.length() %2 != 0){
            switch(num.charAt(num.length()/2)){
                case '1': break;
                case '0': break;
                case '8': break;
                default: return false;
                    
            }
        }
        
        int i = 0, j = num.length() - 1;
        for(; i<j; j--, i++){
            switch(num.charAt(i)){
                case '0': if(num.charAt(j) != '0'){
                    return false;
                }
                    break;
                case '1': if(num.charAt(j) != '1'){
                    return false;
                }
                    break;
                case '8': if(num.charAt(j) != '8'){
                    return false;
                }
                    break;
                case '6': if(num.charAt(j) != '9'){
                    return false;
                }
                    break;
                case '9': if(num.charAt(j) != '6'){
                    return false;
                }
                    break;
                default: return false;
            }
            
        }
        return true;
    }
    
}
