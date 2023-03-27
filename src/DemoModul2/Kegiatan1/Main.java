package DemoModul2.Kegiatan1;

class Main{
    public static void main(String[] args) {
        arrayListDemo obj = new arrayListDemo();
        System.out.println("Nomor 1 dan 2\nOutput :");
        obj.arrayList();

        System.out.println("Bebek = " + obj.cariBebek());
        obj.indexBebek();

        System.out.println("\nNomor 3 \nOutput :");
        obj.removeBebek();
        obj.showArrayList();

        System.out.println("\nNomor 4 \nOutput :");
        obj.showIndex();
        obj.removeIndex0();//Mengahapus element index ke-0 (Angsa)
        obj.showArrayList();
        
        System.out.println("\nNomor 5 \nOutput :");
        obj.indexSet(); //Mengubah element index ke-0
        obj.showArrayList();
        obj.indexAdd();
        obj.showArrayList();

        System.out.println("\nNomor 6 \nOutput :");
        obj.removeIndex15();
        obj.showArrayList();

        System.out.println("\nNomor 7 \nOutput :");
        obj.showFirstLastElement();

        System.out.println("\nNomor 8 \nOutput :");
        System.out.println("Jumlah elemen : " + obj.arrayLong());

        System.out.println("\nNomor 9 \nOutput :");
        obj.indexBadak();
    }
}