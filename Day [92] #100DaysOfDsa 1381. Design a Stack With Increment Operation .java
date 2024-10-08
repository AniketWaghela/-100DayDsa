class CustomStack {

    int[] arr;
    int top;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top>=arr.length-1) {
            return;
        }
        else {
            arr[++top] = x;
        }
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        else{
            return arr[top--];
        }
    }
    
    public void increment(int k, int val) {
        int temp=arr.length,index=0;
        while(temp!=0 && k!=0){
            arr[index++]+=val;
            k--;
            temp--;
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