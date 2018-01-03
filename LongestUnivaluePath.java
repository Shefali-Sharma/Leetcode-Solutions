import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class LongestAbsoluteFilePathClass{
    public static void main(String[] args){
        
        
    }
    
    public int longestUnivaluePath(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        Stack<TreeNode> curr = new Stack<TreeNode>();
        Stack<TreeNode> diff = new Stack<TreeNode>();
        diff.push(root);
        
        int max = 0;
        while(!diff.isEmpty()){
            curr.push(diff.pop());
            int currmax = 0;
            while(!curr.isEmpty()){
                TreeNode parent = curr.pop();
                
                if(parent.left != null && parent.right != null && currmax >= 2){
                    if((parent.left.val == parent.val) && (parent.right.val == parent.val)){
                        currmax++;
                        curr.push(parent.left);
                        curr.push(parent.right);
                    }
                    else{
                        if(parent.left.val == parent.val){
                            currmax++;
                            curr.push(parent.left);
                        }
                        else if(parent.left.val != parent.val){
                            diff.push(parent.left);
                        }
                        if(parent.right.val == parent.val){
                            currmax++;
                            curr.push(parent.right);
                        }
                        else if(parent.right.val != parent.val){
                            diff.push(parent.right);
                        }
                    }
                }
                else{
                    if(parent.left != null){
                        if(parent.left.val == parent.val){
                            currmax++;
                            curr.push(parent.left);
                        }
                        else if(parent.left.val != parent.val){
                            diff.push(parent.left);
                        }
                    }
                    if(parent.right != null){
                        if(parent.right.val == parent.val){
                            currmax++;
                            curr.push(parent.right);
                        }
                        else if(parent.right.val != parent.val){
                            diff.push(parent.right);
                        }
                    }
                }
            }
            
            if(max<currmax){
                max = currmax;
            }
        }
        
        return max;
    }
    
}
