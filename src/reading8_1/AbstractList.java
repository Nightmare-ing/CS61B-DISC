package reading8_1;

public abstract class AbstractList<Item> implements List<Item> {
    private class Sublist extends AbstractList<Item> {
        private int start, end;
        Sublist(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Item get(int k) {
            return AbstractList.this.get(start + k);
        }

        @Override
        public void add(int l, Item x) {
            AbstractList.this.add(start + l, x);
            end += 1;
        }
    }

    @Override
    public void add(int l, Item x) {
        System.out.println("AbstractList's " + l);
    }

    @Override
    public Item get(int k) {
        System.out.println("AbstractList's " + k);
        return null;
    }

    @Override
    public List<Item> subList(int start, int end) {
        return new Sublist(start, end);
    }
}
