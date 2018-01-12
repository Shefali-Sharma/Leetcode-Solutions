import java.util.HashMap;

public class MovingAverageClass{
    public static void main(String[] args){
        
        
    }
    
    private int size_avg;
    int[] num;
    int count = 0, sum = 0, flag = 0;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        size_avg = size;
        num = new int[size];
    }
    
    public double next(int val) {
        
        if(count<size_avg && flag==0){
            num[count++] = val;
            sum += val;
            return (double)sum/(double)count;
        }
        
        if(count >= size_avg){
            count = 0;
            flag = 1;
        }
        sum -= num[count];
        num[count] = val;
        count++;
        sum+= val;
        
        return (double)sum/(double)size_avg;
    }
    
    /**
     * Your MovingAverage object will be instantiated and called as such:
     * MovingAverage obj = new MovingAverage(size);
     * double param_1 = obj.next(val);
     */
}
