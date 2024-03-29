package DemoModul3.Java;

public class LinkQueue {
    public FirstLastList theList;
    private int qsize = 0;

    public LinkQueue(){
        theList = new FirstLastList();
    }

    public int size(){
        return qsize;
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void enqueue(String j){
        theList.insertLast(j);
        qsize += 1;
    }
    public String dequeue(){
        qsize -= 1;
        return theList.deleteFirst();
    }

    public void displayQueue(){
        theList.displayLisk();
    }

    public void peek(){
        theList.peekFirst();
    }
}
