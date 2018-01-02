import java.util.HashMap;

public class DailyTemperatures_OptimizedClass{
    public static void main(String[] args){
        
        
    }
    
    //Using Stack
    public int[] dailyTemperaturesUsingStack(int[] temperatures) {
        int []days = new int[temperatures.length];
        
        Stack<Integer> stack = new Stack();
        for(int i = temperatures.length - 1; i>=0; --i){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return days;
    }
    
    
}
