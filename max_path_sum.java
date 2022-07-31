class Solution {
    int max;
    
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        helper(root);
        return max;
    }
    
    public int helper(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l = Math.max(helper(root.left),0);        
        int r = Math.max(helper(root.right),0);
        max = Math.max(max,l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}    
