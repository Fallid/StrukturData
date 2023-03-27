package DemoModul2.Kegiatan2;

public class Main {
    public static void main(String[] args) {
        Link myLink = new Link();
        myLink.add(6);
        myLink.add(8);
        myLink.add(4);
        myLink.add(5);
        
        //Linklist sebelum data di sorting
        System.out.print("Before : ");
        myLink.showData();

        //Linklist setelah data di sorting
        System.out.print("\nAfter  : ");
        myLink.sorting();
        myLink.showData();

        
    }
}
