class ConstrucBinaryTree1 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        // preorder 为空，返回null
        if (pStart == pEnd) return null;
        int rootVal = preorder[pStart];
        TreeNode root = new TreeNode(rootVal);
        // 在中序遍历中找到root的位置
        int iRootIndex = 0;
        for (int i = iStart; i < iEnd; i++) {
            if (rootVal == inorder[i]) {
                iRootIndex = i;
                break;
            }
        }
        int leftNum = iRootIndex - iStart;

        root.left = buildTreeHelper(preorder, pStart + 1, pStart + leftNum + 1, inorder, iStart, iEnd);

        root.right = buildTreeHelper(preorder, pStart + leftNum + 1, pEnd, inorder, iRootIndex + 1, iEnd);

        return root;
    }
}