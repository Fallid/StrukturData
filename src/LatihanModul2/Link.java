package LatihanModul2;

public class Link {
    Node head;
    public void add(String data){
        if (head == null){
            head = new Node(data);
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void showData(){
        if (head == null){
            System.out.println("LinkList is Empty");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
            String data = current.data;
            System.out.print(data + ", ");
        }
    }
}
