public class MyQueue {

    private int seek=0;
    private List<Integer> stacks;

    public MyQueue() {
        this.stacks = new ArrayList<>();
    }
    
    public void push(int x) {
        this.stacks.add(x);
    }
    
    public int pop() {
        if(this.stacks.size()==0){
            return -1;
        }
        int element = this.stacks.get(0);
        this.stacks.remove(0);
        return element;
    }
    
    public int peek() {
       if(this.stacks.size()==0){
            return -1;
        }
        int element = this.stacks.get(0);
        return element;
    }
    
    public boolean empty() {
        return this.stacks.size()==0;
    }
    

}
