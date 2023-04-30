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
        return theList.deleteFirst();
    }

    public void displayQueue(){
        System.out.println("Head to tail : ");
        theList.displayLisk();
    }
}
