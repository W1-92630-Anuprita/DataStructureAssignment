class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int value) {
        this.val = value;
        left = right = null;
    }
}

public class BSTLevelFinder {
    public static int getLevel(TreeNode root, int key) {
        return findLevel(root, key, 1);
    }

    private static int findLevel(TreeNode node, int key, int level) {
        if (node == null) return 0;

        if (node.val == key) return level;

        if (key < node.val)
            return findLevel(node.left, key, level + 1);
        else
            return findLevel(node.right, key, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);

        int key = 15;
        int level = getLevel(root, key);
        if (level != 0)
            System.out.println("Node " + key + " is at level: " + level);
        else
            System.out.println("Node " + key + " not found in the BST.");
    }
}
