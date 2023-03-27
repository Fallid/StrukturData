package DemoModul2.Kegiatan2;


public class Link {
    Node head;
    public void add (int data){
        if(head == null){
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
            System.out.println("Link is Empty");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
            int data = current.data;
            System.out.print(data + " ");
        }
    }

    public void sorting(){
        //Posisi sekarang atau paling awal
       Node current = head;
        //Posisi index dari linked list
       Node index = null;
       //Menyimpan posisi index sementara untuk ditukar nanti
       int temp;
       //Mengecek apakah linklist masih kosong atau tidak
       if(head == null){
        return;
       }
       //Jika linklist berisikan data
       else{

        while(current != null){
            while(index != null){
                
                if(current.data > index.data){
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            index = current.next;
            current = current.next;
        }
       }
    }
}
