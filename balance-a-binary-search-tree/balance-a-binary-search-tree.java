/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        getList(root, list);
        return toTree(list,0,list.size()-1);
    }
    
    public void getList(TreeNode root, List<TreeNode> list) {
        
        if(root==null) return;
        
        getList(root.left, list);
        list.add(root);
        getList(root.right, list);
        
    }
    
    public TreeNode toTree(List<TreeNode> list,int si,int ei) {
        if(si>ei) return null;
        
        int mid = si+ (ei-si)/2;
  
        TreeNode root = list.get(mid);
        root.left = toTree(list,si,mid-1);
        root.right = toTree(list,mid+1,ei);
        return root;
        
    }
}