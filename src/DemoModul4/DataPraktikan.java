package DemoModul4;

import java.util.HashMap;

public class DataPraktikan {
    HashMap<String, String> tabelData = new HashMap<String, String>();
    HashMap<String, String> tableSesiLogin = new HashMap<String, String>();
    
    boolean tambahData(String nimPraktikan, String namaAsisten){
        boolean verif;
        if(nimPraktikan.matches("IF(.*)") && nimPraktikan.matches("(.*)[0-9]+") && !tabelData.containsKey(nimPraktikan)){
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil ditambahkan! \ntekan apasaja untuk kembali ke halaman utama...");    
            verif = true;
        }else{
            System.out.println("Format NIM salah!\nContoh format NIM yang benar IF2021\n\n");
            verif = false;
        }
        return verif;
    }
    
    void tampil(){
        System.out.println("Total Data yang Tersimpan : " + tabelData.size() + "\n");
        for (String i : tabelData.keySet()){
            System.out.print("NIM : " + i);
            System.out.println("\t\tNama Asisten : "+ tabelData.get(i));
        }
    }

    void listNimPraktikan(){
        int nomor=1;
        for (String nim : tabelData.keySet()){
            System.out.println(nomor + ". NIM : " + nim);
            nomor++;
        }
    }
    
    void listNamaAsisten(){
        int nomor=1;
        for (String nama : tabelData.values()){
            System.out.println(nomor + ". Nama Asisten : " + nama);
            nomor++;
        }
    }

    int totalEmail(){
        return tabelData.size();
    }

    boolean hapusData(String nimPraktikan, String namaAsisten){
        boolean verif;
        if(!nimPraktikan.isEmpty() && !namaAsisten.isEmpty()){
            tabelData.remove(nimPraktikan, namaAsisten);
            verif = true;
        }else{
            verif = false;
        }
        return verif;
    }

    void editData(String nimPraktikan, String namaAsisten){
            if(tabelData.containsKey(nimPraktikan)){
                tabelData.remove(nimPraktikan, namaAsisten);
                tabelData.put(nimPraktikan, namaAsisten);
            }else{
                System.out.println("\nData Tidak ada!");
            }
        
    }

    void dataEmail(){
        tableSesiLogin.put("naufal@umm.ac.id", "admin1");
        tableSesiLogin.put("ahmad@umm.ac.id", "admin2");
    }

    boolean loginEmail(String Email, String Password){
        boolean verif;
        if(Email.matches("(.*)@umm.ac.id") && tableSesiLogin.containsValue(Password) && tableSesiLogin.containsKey(Email)){
            verif = true;
        }else{
            verif = false;
        }
        return verif;
    }
}
