package DemoModul3.Java;
//Class Stack Modul 3
public class Stack {
    private int MaxSize;
    private String[] stackArray;
    private int top;

    public Stack(int a){
        MaxSize = a;
        stackArray = new String[MaxSize];
        top = -1;
    }

    public void push(String j){
        stackArray[++top] = j;
    }

    public String pop(){
        return stackArray[top--];
    }
    public String peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isfull(){
        return (top == MaxSize-1);
    }
}
