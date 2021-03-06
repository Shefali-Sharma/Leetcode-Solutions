import java.util.HashMap;

public class IslandPerimeterClass{
    public static void main(String[] args){
        
        
    }
    
    public int islandPerimeter(int[][] grid) {
        int count = 0, neighbours = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    count++;
                    if((i<grid.length - 1) && (grid[i+1][j]==1)){
                        neighbours++;
                    }
                    if((j<grid[i].length - 1) && (grid[i][j+1]==1)){
                        neighbours++;
                    }
                }
                
            }
        }
        
        return (count*4 - neighbours*2);
    }
    
}
