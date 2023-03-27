package DemoModul2.Kegiatan1;

import java.util.ArrayList;

public class arrayListDemo {
    int size;
    int bebek;
    ArrayList<String> _ArraylistHewan = new ArrayList<>();
    
    //Mengetahui jumlah element yang ada pada arraylist
    public int arrayLong(){
        return size = _ArraylistHewan.size();
    }
    //Latihan 1 Nomor 1
    public void arrayList(){

            _ArraylistHewan.add("Angsa");
            _ArraylistHewan.add("Bebek");
            _ArraylistHewan.add("Cicak");
            _ArraylistHewan.add("Domba");
            _ArraylistHewan.add("Elang");
            _ArraylistHewan.add("Gajah");

            //Output arraylist sebelum ditambahkan element element baru
            System.out.println("ArrayList Elements:\n" + _ArraylistHewan + "\n");
            
            //Penambahan element baru yaitu badak dan bebek untuk nomor 2
            _ArraylistHewan.add("Badak");
            _ArraylistHewan.add("Bebek");
            //output terbaru ketika sudah menambahkan element badak dan bebek
            System.out.println("ArrayList Elements:\n" + _ArraylistHewan + "\n");
            size = _ArraylistHewan.size();
           
        }

    public int cariBebek(){
        for(int i = 0; i < size; i++){
            if(_ArraylistHewan.get(i).equals("Bebek")){
                bebek++;
            }
        }
        return bebek;
    }

    public void indexBadak(){
        System.out.println("Posisi Index : " + _ArraylistHewan.indexOf("Badak"));
    }
    
    public void indexBebek(){
        System.out.println("Posisi Index : " + _ArraylistHewan.indexOf("Bebek") + ", " + _ArraylistHewan.lastIndexOf("Bebek"));
        
    }

    public String indexSet(){//Mengganti element index ke-0 (Cicak) Mnejadi (Ular)
        return _ArraylistHewan.set(0, "Ular");
    }

    public void indexAdd(){
        _ArraylistHewan.add(2, "Itik");
    }

    public void removeBebek(){
        _ArraylistHewan.remove("Bebek");
    }
    public void removeIndex0(){
        _ArraylistHewan.remove(0);
    }

    //Kegiatan 1 nomor 6
    public void removeIndex15(){
        _ArraylistHewan.remove("Itik"); //Index ke 2
        _ArraylistHewan.remove("Elang"); //Index ke 3 (2)
        _ArraylistHewan.remove("Gajah"); //Index ke 4 (3)
    }

    //Method untuk menampilkan arraylist yang terus terupdate
    public void showArrayList(){
        System.out.println(_ArraylistHewan);
    }

    //Latihan 1 nomor 4 
    public void showIndex(){
        System.out.println("Index Ke-0 : " + _ArraylistHewan.get(0));
        System.out.println("Index ke-2 : " + _ArraylistHewan.get(2));
    }

    public void showFirstLastElement(){
        size = _ArraylistHewan.size();
        System.out.println("Elemen Pertama  : " + _ArraylistHewan.get(0));
        System.out.println("Elemen Terakhir : " + _ArraylistHewan.get(size-1));
    }

}
