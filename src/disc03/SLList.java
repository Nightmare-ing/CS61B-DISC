package disc03;

public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public void insert(int item, int position) {
        if (position == 0 || first == null) {
            addFirst(item);
            return;
        }
        IntNode p = first;
        while (position > 1 && p.next != null) {
            p = p.next;
            position--;
        }
        p.next = new IntNode(item, p.next);
    }

    public void print() {
        IntNode p = first;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

//    public void reverse() {
//        IntNode rest = first;
//        first = null;
//        while (rest != null) {
//            IntNode temp = rest.next;
//            rest.next = first;
//            first = rest;
//            rest = temp;
//        }
//    }

    public void reverse() {
        reverseHelper(first);
    }

    private IntNode reverseHelper(IntNode first) {
        if (first == null || first.next == null) {
            return first;
        }
        this.first = first.next;
        reverseHelper(first.next).next = first;
        first.next = null;
        return first;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.reverse();
        L.insert(1, 0);
        L.addFirst(10);
        L.addFirst(5);
        L.addFirst(15);
        L.insert(20, 1);
        L.insert(2, 0);
        L.insert(6, 2);
        L.print();

        L.reverse();
        L.print();

    }
}
