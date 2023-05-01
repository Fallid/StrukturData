package DemoModul3.Java;

import java.util.Scanner;
public class Kegiatan2 {
    public static void main(String[] args) {
        LinkQueue namaBarang = new LinkQueue();
        LinkQueue jenisBarang = new LinkQueue();
        LinkQueue hargaBarang = new LinkQueue();
        String dataUser, namaItem, jenisItem, hargaItem, verifPesanan;
        try (Scanner inputData = new Scanner(System.in)) {
            jenisBarang.enqueue("Sepatu Sport");
            namaBarang.enqueue("NIKE-AIR");
            hargaBarang.enqueue("Rp.1.000.000");
            jenisBarang.enqueue("Sepatu Casual");
            namaBarang.enqueue("PUMA-PRIME");
            hargaBarang.enqueue("Rp.800.000");
            
            while(!inputData.equals("4")){
            System.out.println("Antiran pesanan masuk (Kiri --> Kanan):\n");
            System.out.print("|Jenis\t: ");
            jenisBarang.displayQueue();
            System.out.print("|Nama\t: ");
            namaBarang.displayQueue();
            System.out.print("|Harga\t: ");
            hargaBarang.displayQueue();
            System.out.println("Menu Pilihan:");
            System.out.print("[1] Tambah item. \n[2] Item selesai diproses. \n[3] Total item. \n[4] Exit Program. \nPilih: ");
            dataUser = inputData.nextLine();

                switch (dataUser) {
                    case "1":
                        System.out.println("\n==== Tambah Item ====");
                        System.out.print("Jenis Barang\t: ");
                        jenisItem = inputData.nextLine();
                        jenisBarang.enqueue(jenisItem);

                        System.out.print("Nama Barang\t: ");
                        namaItem = inputData.nextLine();
                        namaBarang.enqueue(namaItem);

                        System.out.print("Harga Barang\t: ");
                        hargaItem = inputData.nextLine();
                        hargaBarang.enqueue("Rp."+hargaItem);

                        System.out.println("Data berhasil ditambahkan...\nTekan apa saja untuk melanjutkan program.");
                        inputData.nextLine();
                        System.out.println("\n");
                        break;
                    case "2":
                        System.out.println("\n==== Selesaikan Pesanan ====");
                        System.out.print("Apakah Anda yakin untuk menyelesaikan pesanan?\nPesanan yang sudah diselesaikan akan otomatis terhapus!\nPilih [y/n]\t:");
                        verifPesanan = inputData.nextLine();
                        switch (verifPesanan.toLowerCase()) {
                            case "y":
                                namaBarang.dequeue();
                                jenisBarang.dequeue();
                                hargaBarang.dequeue();
                                System.out.println("Pesanan berhasil diselesaikan! \nTekan apapun untuk kembali ke halaman utama....");
                                inputData.nextLine();
                                break;
                            case "yes":
                                namaBarang.dequeue();
                                jenisBarang.dequeue();
                                hargaBarang.dequeue();
                                System.out.println("Pesanan berhasil diselesaikan! \nTekan apapun untuk kembali ke halaman utama....");
                                inputData.nextLine();
                                break;
                            case "n":
                                System.out.println("Pesanan gagal diselesaikan! \nTekan apapun untuk kembali ke halaman utama...");
                                inputData.nextLine();
                                break;
                            case "no":
                                System.out.println("Pesanan gagal diselesaikan! \nTekan apapun untuk kembali ke halaman utama...");
                                inputData.nextLine();
                                break;
                                
                            default:
                                System.out.println("Pesanan gagal diselesaikan! \nTekan apapun untuk kembali ke halaman utama...");
                                inputData.nextLine();
                                break;
                        }
                        break;
                    case "3":
                        System.out.print("\nJumlah pesanan : " + namaBarang.size() + " item(s)\nTekan apa saja untuk melanjutkan program.\n");
                        inputData.nextLine();
                        System.out.println("\n");
                        break;
                    case "4":
                        System.out.println("Ini pilihan ke 4");
                        System.exit(100);
                    default:
                        System.out.println("Terjadi kesalahan saat melakukan input!");
                        System.exit(404);
                        break;
                }
            }
        }

        // Menu pilihan untuk size, dequeue, enqueue


        
    }
}
