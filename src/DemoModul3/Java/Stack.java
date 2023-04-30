package DemoModul3.Java;

public class Stack {
    private int MaxSize;
    private long[] stackArray;
    private int top;

    public Stack(int a){
        MaxSize = a;
        stackArray = new long[MaxSize];
        top = -1;
    }

    public void push(long j){
        stackArray[++top] = j;
    }

    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isfull(){
        return (top == MaxSize-1);
    }
}
