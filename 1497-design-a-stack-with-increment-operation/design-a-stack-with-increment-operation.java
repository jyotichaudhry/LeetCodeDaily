class CustomStack {

 
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
   int maxStackSize ;

    public CustomStack(int maxSize) {
        this.maxStackSize = maxSize;
    }

    public void push(int x) {
        if (stack1.size() < maxStackSize){
            stack1.push(x);
        }
    }

    public int pop() {
return stack1.isEmpty() ?  -1:  stack1.pop();
    }

    public void increment(int k, int val) {
        if (stack1.isEmpty()) return;
        int diff = stack1.size() - k;
        while (!stack1.isEmpty() ){
            if (diff > 0){
                stack2.add(stack1.pop());
            } else {
                stack2.add(stack1.pop()+val);
            }
             diff--;
        }
        while (!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */