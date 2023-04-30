package DemoModul3.Java;

public class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertLast(String dd){
        Link newLink = new Link(dd);
        if(isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
        }
        last = newLink;
    }

    public String deleteFirst(){
        String temp = (String) first.dataItem;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayLisk(){
        Link sekarang = first;
        while(sekarang != null){
            sekarang.displayLink();
            sekarang = sekarang.next;
        }
        System.out.println("");
    }
}
