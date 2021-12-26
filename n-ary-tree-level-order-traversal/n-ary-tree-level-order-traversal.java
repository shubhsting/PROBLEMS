/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        
        queue.addLast(root);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        while(queue.size()>0){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            while(size-->0){
                Node ele = queue.removeFirst();
                level.add(ele.val);
                
                for(Node item:ele.children) {
                    queue.addLast(item);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}