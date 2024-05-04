package guide21;

public class IntTree {
    public final int data;
    public IntTree left, right;
    public IntTree(int data, IntTree left, IntTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static IntTree mergeRight(IntTree T, IntTree L) {
        T.left = mergeRightHelper(T.left, Integer.MAX_VALUE, L);
        return T;
    }

    private static IntTree mergeRightHelper(IntTree T, int threshold, IntTree L) {
        if (L.left == null) {
            return T;
        }
        if (T == null) {
            if (L.left.data < threshold) {
                IntTree p = L.left;
                L.left = L.left.right;
                p.right = mergeRightHelper(null, threshold, L);
                return p;
            }
        } else {
            if (T.data > L.left.data) {
                T.left = mergeRightHelper(T.left, T.data, L);
            }
            if (L.left != null && T.data <= L.left.data){
                T.right = mergeRightHelper(T.right, threshold, L);
            }
        }
        return T;
    }

    public static void main(String[] args) {
        IntTree T, L;
        T = new IntTree(999, new IntTree(12,
                new IntTree(3, null, new IntTree(10, new IntTree(8, null, null), null)),
                new IntTree(16, new IntTree(14, null, null), new IntTree(27, null, null))), null);
        L = new IntTree(1000, new IntTree(1,
                null, new IntTree(11, null, new IntTree(26, null, null))), null);

        mergeRight(T, L);
    }
}
