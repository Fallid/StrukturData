package DemoModul4;

import java.util.Scanner;

public class Kegiatan1 {
    public static void main(String[] args) {
        String pilihMenu, inputNIM ,inputAsisten, inputEmail, inputPassword;
        boolean logout = false;
        DataPraktikan obj = new DataPraktikan();
        try (Scanner inputData = new Scanner(System.in)) {
            do{
                System.out.println("==== LOGIN ====\n");
                System.out.print("Masukkan Email : ");
                inputEmail = inputData.nextLine();
                System.out.print("Masukkan Password : ");
                inputPassword = inputData.nextLine();
                obj.dataEmail();
                obj.loginEmail(inputEmail, inputPassword);
                if(obj.loginEmail(inputEmail, inputPassword) == true){
                    System.out.println("==== BERHASIL LOGIN SELAMAT DATANG ====\n\n");
                }else{
                    System.out.println("GAGAL LOGIN");
                }
            }while(obj.loginEmail(inputEmail, inputPassword) == false);

            while(logout == false){
                System.out.print("==== MODUL 4 DATA PRAKTIKAN ==== \n[1]Tambah Data. \n[2]Tampil Data. \n[3]List NIM Praktikan. \n[4]List Nama Asisten. \n[5]Total Data. \n[6]Hapus Data. \n[7]Edit Data. \n[8]Log Out. \nPilih : ");
                pilihMenu = inputData.nextLine();
                if(pilihMenu.matches("[0-9]+")){
                    switch(pilihMenu){
                        case "1":
                            System.out.println("\n==== Tambah Data ====\n");
                            System.out.print("Masukan NIM : ");
                            inputNIM = inputData.nextLine();
                            System.out.print("Masukan nama asisten : ");
                            inputAsisten = inputData.nextLine();
                            obj.tambahData(inputNIM, inputAsisten);
                            inputData.nextLine();
                            break;

                        case "2":
                            System.out.println("\n==== Tampil Data ====\n");
                            obj.tampil();
                            System.out.println("\nTekan apasaja untuk kembali ke halaman utama...");
                            inputData.nextLine();
                            System.out.println("\n");
                            break;

                        case "3":
                            System.out.println("\n==== List NIM Praktikan ====\n");
                            obj.listNimPraktikan();
                            System.out.println("\nTekan apasaja untuk kembali ke halaman utama...");
                            inputData.nextLine();
                            System.out.println("\n");
                            break;

                        case "4":
                            System.out.println("\n==== List Nama Asisten ====\n");
                            obj.listNamaAsisten();
                            System.out.println("\nTekan apasaja untuk kembali ke halaman utama...");
                            inputData.nextLine();
                            System.out.println("\n");
                            break;

                        case "5":
                            System.out.println("\n==== Total Data ====\n");
                            System.out.println("Total data yang tersimpan : " + obj.totalEmail());
                            System.out.println("\nTekan apasaja untuk kembali ke halaman utama...");
                            inputData.nextLine();
                            System.out.println("\n");
                            break;

                        case "6":
                            System.out.println("\n==== Hapus Data ====\n");
                            System.out.print("Masukan NIM : ");
                            inputNIM = inputData.nextLine();
                            System.out.print("Masukan nama asisten : ");
                            inputAsisten = inputData.nextLine();
                            obj.hapusData(inputNIM, inputAsisten);
                            System.out.println("\nTekan apasaja untuk kembali ke halaman utama...");
                            inputData.nextLine();
                            System.out.println("\n");
                            break;

                        case "7":
                            System.out.println("\n==== Edit Data ====\n");
                            System.out.print("Masukan NIM : ");
                            inputNIM = inputData.nextLine();
                            System.out.print("Masukan nama asisten : ");
                            inputAsisten = inputData.nextLine();
                            obj.editData(inputNIM, inputAsisten);
                            System.out.println("\nTekan apasaja untuk kembali ke halaman utama...");
                            inputData.nextLine();
                            System.out.println("\n");
                            break;

                        case "8":
                            System.out.println("\n==== LOG OUT ==== \nBerhasil Log Out");
                            logout = true;
                            break;

                        default:
                            System.out.println("\n==== PILIHAN TIDAK ADA ====\n\n");
                            break;
                    }
                }else{
                    System.out.println("Format yang dimasukkan salah!\n\n");
                }
            }
        }catch(Exception err){
            System.out.println(err);
        }
    }
}
