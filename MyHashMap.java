class MyHashMap {

    // 해시 함수에 해시값을 만드는 상수
    private static final int SIZE = 10000;
    private Node[] buckets;
    
    private static class Node {
        int key;
        int value;
        Node next;//Singly Linked List(단일연결리스트) 를 만들기 위한 필드

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    // 해쉬 함수
    // 버킷을 조회할 해쉬값 생성
    private int getIndex(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int idx = getIndex(key);
        if (buckets[idx] == null) {
            buckets[idx] = new Node(key, value);
            return;
        }

        Node curr = buckets[idx];
        Node prev = null;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value; 
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        //해시값 충돌 시 넣는 경우
        prev.next = new Node(key, value); 
    }

    public int get(int key) {
        int idx = getIndex(key);
        Node curr = buckets[idx];
        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = getIndex(key);
        Node curr = buckets[idx];
        Node prev = null;
        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    // 첫번째일 경우 다음 객체를 당겨서 옮긴다
                    buckets[idx] = curr.next; 
                } else {
                    //중간값일 경우 뒤의 값을 앞의 다음 값으로 옮긴다.
                    prev.next = curr.next; 
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
