class MinStack {
    Stack<Integer> minst;
    Stack<Integer> st;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(!minst.isEmpty()){
            min = Math.min(val,minst.peek());
            minst.push(min);
        }else{
            minst.push(val);
        }
    }
    
    public void pop() {
        if(!st.isEmpty() && !minst.isEmpty()){
            st.pop();
            minst.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
