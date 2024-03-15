package reading8_1;

public interface List<Item> {
    Item get(int k);
    void add(int l, Item x);
    List<Item> subList(int start, int end);

}
