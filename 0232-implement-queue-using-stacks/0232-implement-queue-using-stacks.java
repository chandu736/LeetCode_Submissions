class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> queue;
    public MyQueue() {
        inStack=new Stack<>();
        queue=new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        if(queue.isEmpty()){
            while(!inStack.isEmpty()){
                queue.push(inStack.pop());
            }
        }
        return queue.pop();
    }
    
    public int peek() {
        if(queue.isEmpty()){
            while(!inStack.isEmpty()){
                queue.push(inStack.pop());
            }
        }
        return queue.peek();
    }
    
    public boolean empty() {
        return inStack.isEmpty() && queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */