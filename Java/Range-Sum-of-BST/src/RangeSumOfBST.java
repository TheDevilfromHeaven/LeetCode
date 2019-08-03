public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        /**
         * 不会
         * 作者：guanpengchn
         * 链接：https://leetcode-cn.com/problems/two-sum/solution/hua-jie-suan-fa-938-er-cha-sou-suo-shu-de-fan-wei-/
         * 具体请看作者的解释。
         */
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }

    public static void main(String[] args) {
        System.out.println("1");
    }
}
