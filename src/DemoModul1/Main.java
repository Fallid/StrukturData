package DemoModul1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int pilihan;
        double alas, tinggi;

        System.out.println("Mau menampilkan hasil luas dalam bentuk? : \n1. Hasil to Integer \n2. Hasil to Double \nMasukkan pilihan 1/2");
        pilihan = inputData.nextInt();
        switch (pilihan){
            case 2:
                System.out.print("Masukkan Nilai Alas: ");
                alas = inputData.nextDouble();
                System.out.print("Masukkan Nilai Tinggi: ");
                tinggi = inputData.nextDouble();
                Segitiga<Double> luasTipeDouble = new Segitiga<>(alas, tinggi);
                System.out.println(luasTipeDouble.getResultDouble());
                break;
            case 1:
                System.out.print("Masukkan Nilai Alas: ");
                alas = inputData.nextInt();
                System.out.print("Masukkan Nilai Tinggi: ");
                tinggi = inputData.nextInt();
                Segitiga<Integer> luasTipeInt = new Segitiga<>((int)alas,(int)tinggi);
                System.out.println(luasTipeInt.getResultInt());
                break;
            default:
                System.out.println("Pilihan Tidak Ditemukan");
                break;
        }
    }
}
