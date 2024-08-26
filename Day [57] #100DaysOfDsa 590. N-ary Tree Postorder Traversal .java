class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return postTraversal(root,list);
    }

    public List<Integer> postTraversal(Node root, List<Integer> list){
        if(root == null) return list;

        for(Node child: root.children){
            postTraversal(child,list);
        }
        list.add(root.val);
        return list;
    }
}