import java.util.Stack;

class MyQueue {
    // java Stack util 사용
    // 입력, 출력 stack 생성
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    public void push(int x) {
        // 입력 스택 쌓기
        stackIn.push(x);
    }
    
    public int pop() {
        // 출력 스택이 비었을 경우 
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                // 입력 스택이 비워질 때 까지 출력 스택에 옮겨 pop 되는 순서 변경 
                // stack 의 FILO 의 특성을 살려 입력 된 것을 다른 스택으로 옮겼을 경우 순서가 변경되는 것을 이용
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }
    
    public int peek() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.peek();
    }
    
    public boolean empty() {
        // 스택 입력과 출력이 모두 비었을 경우 empty true
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
