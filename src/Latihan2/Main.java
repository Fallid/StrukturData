package Latihan2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> _arrayListAdding = new ArrayList<>();
        ArrayList<String> _arrayListRemoving = new ArrayList<>();
        
        //Adding elements to array
        _arrayListAdding.add(0,"Sapi");
        _arrayListAdding.add(1,"Kelinci");
        _arrayListAdding.add(2,"Kambing");
        _arrayListAdding.add(3,"Unta");
        _arrayListAdding.add(4,"Domba");
        //Printout the result of element in array
        System.out.println("Hewan : "+_arrayListAdding + "\n");
        
        //Removing elements from array
        _arrayListRemoving.add("Kelinci");
        _arrayListRemoving.add("Kambing");
        _arrayListRemoving.add("Unta");
        //Semua yang diremove adalah index 1 karena ketika kelinci (index 1) di hapus maka total index berkurang dari 4 menjadi 3
        _arrayListAdding.remove(1);
        _arrayListAdding.remove(1);
        _arrayListAdding.remove(1);
        // _arrayListAdding.remove(3);
        //Printout elements who want to remove
        System.out.println("Hewan yang dihapus: \n\n"+_arrayListRemoving+"\n");
        System.out.println("Output Hewan : \n\n"+_arrayListAdding);

    }
}
