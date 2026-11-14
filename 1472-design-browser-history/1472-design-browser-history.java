class BrowserHistory {
    Node hm;
    Node cur;
    public BrowserHistory(String homepage) {
         hm= new Node(homepage);
         cur=hm;
        
        
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        cur.next=temp;
        temp.prev=cur;
        cur=temp;
        
    }
    
    public String back(int steps) {
        while(cur.prev!=null&&steps-->0){
            cur=cur.prev;
        }
        return cur.val;
        
    }
    
    public String forward(int steps) {
         while(cur.next!=null&&steps-->0){
            cur=cur.next;
        }
        return cur.val;
        
    }
}
class Node{
    Node prev;
    String val;
    Node next;
    Node(String s){
        val=s;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */