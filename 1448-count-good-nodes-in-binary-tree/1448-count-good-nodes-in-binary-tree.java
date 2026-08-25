class Solution {
    public int goodNodes(TreeNode root) {
        return countGood(root, Integer.MIN_VALUE);
    }

    public int countGood(TreeNode root, int maxSoFar) {
        if(root == null)
            return 0;
        int count = 0;
        if(root.val >= maxSoFar)
            count = 1;
        int newMax = Math.max(maxSoFar, root.val);
        count += countGood(root.left, newMax);
        count += countGood(root.right, newMax);
        return count;
    }
}