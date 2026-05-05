//Leetcode 112
class Solution {
    private boolean res = false; 
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return search(root,0,targetSum);
        
    }
    public boolean search(TreeNode root,int Sum,int target){
        if(root==null){
            return false;
        }
        Sum+=root.val;
        if(root.left==null && root.right ==null){
            if(Sum==target)return true;
            return false;
        }
       return search(root.left,Sum,target)|| search(root.right,Sum,target);
        

    }
}
