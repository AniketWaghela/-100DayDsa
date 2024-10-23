class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        root.val = 0;  

        // BFS for level-order traversal
        while (!q.isEmpty()) {
            int n = q.size();
            int levelSum = 0; 

            List<TreeNode> currLevel = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                currLevel.add(curr);

                if (curr.left != null) {
                    q.add(curr.left);
                    levelSum += curr.left.val;
                }
                if (curr.right != null) {
                    q.add(curr.right);
                    levelSum += curr.right.val;
                }
            }
            for (TreeNode node : currLevel) {
                int siblingSum = 0;

                if (node.left != null) siblingSum += node.left.val;
                if (node.right != null) siblingSum += node.right.val;

                if (node.left != null)  node.left.val = levelSum - siblingSum;
                if (node.right != null) node.right.val = levelSum - siblingSum;
            }
        }
        
        return root;
    }
}