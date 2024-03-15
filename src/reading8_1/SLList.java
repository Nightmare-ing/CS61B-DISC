package reading8_1;

public class SLList<Item> extends AbstractList<Item> {

    @Override
    public Item get(int k) {
        System.out.println("SLList's " + k);
        return null;
    }

    @Override
    public void add(int l, Item x) {
        System.out.println("SLList's " + l);
    }

    public static void main(String[] args) {
        List<Integer> listInst = new SLList<Integer>();
        List<Integer> subListInst = listInst.subList(1, 3);
        subListInst.add(1, 1);
        subListInst.get(1);
    }
}
