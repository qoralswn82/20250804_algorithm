class MyHashMap {

    private static class Node {
        private int key;
        private int value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<Node> list;

    public MyHashMap() {
        this.list=new LinkedList<>();
    }
    
    public void put(int key, int value) {
        int index = IntStream.range(0, this.list.size())
            .filter(i -> this.list.get(i).key == key)
            .findFirst()
            .orElse(-1);
        if(index == -1){
            Node map = new Node(key,value);
            this.list.add(map);
            return;
        }
        this.list.get(index).value = value;
    }
    
    public int get(int key) {
        int index = IntStream.range(0, this.list.size())
            .filter(i -> this.list.get(i).key == key)
            .findFirst()
            .orElse(-1);
        return this.list(index).value;
    }
    
    public void remove(int key) {
        int index = IntStream.range(0, this.list.size())
            .filter(i -> this.list.get(i).key == key)
            .findFirst()
            .orElse(-1);
        this.list.remove(index);
    }
}
