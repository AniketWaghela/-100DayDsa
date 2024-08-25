class Solution {
    public List<Integer> preorderhelper(TreeNode root, List<Integer> list){
        if(root == null) return list;

        preorderhelper(root.left,list);
        preorderhelper(root.right,list);

        list.add(root.val);

        return list;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return preorderhelper(root,list);
    }
}