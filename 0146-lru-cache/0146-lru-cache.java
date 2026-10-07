public class Node {
    int data;
    int key;
    Node prev;
    Node next;

    public Node(int key,int data) {
        this.data = data;
        this.key = key;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = head;
    }

    public int get(int key) {

        if (map.containsKey(key)) {

            Node x = map.get(key);
            int res = x.data;
            if (x != tail) {
                x.next.prev = x.prev;
                x.prev.next = x.next;
                tail.next = x;
                x.prev=tail;
                tail=tail.next;
            }
            return res;
        }
        return -1;

    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && map.size() < capacity) {
            Node nn = new Node(key, value);
            tail.next = nn;
            nn.prev = tail;
            tail = tail.next;
            map.put(key, nn);

        } else if (map.containsKey(key)) {
            map.get(key).data = value;
            Node x = map.get(key);
           
            if (x != tail) {
                x.next.prev = x.prev;
                x.prev.next = x.next;
                tail.next = x;
                x.prev=tail;
                tail=tail.next;
            }
        } else if (!map.containsKey(key) && map.size() == capacity) {
            Node x;
            if (head.next != tail) {
                
                x=head.next;
                int temp=x.key;
                x.next.prev = x.prev;
                x.prev.next = x.next;
                x.key = key;
                x.data = value;
                tail.next = x;
                x.prev=tail;
                tail = tail.next;
                map.remove(temp);
                map.put(key, x);
            } else {
                int temp=tail.key;
                tail.key=key;
                tail.data=value;
                map.remove(temp);
                map.put(key,tail);

            }
            
           

        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */