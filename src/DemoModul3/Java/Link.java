package DemoModul3.Java;

public class Link {
    public String dataItem;
    public Link next;

    public Link(String data){
        dataItem = data;
    }

    public void displayLink(){
        System.out.print(dataItem + " ");
    }
}
