package tugaspr;

import java.util.Scanner;

public class guestrecord {

    public static void main(String[] args) {
        menu();
    }

    private static void absenkuota() {
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tamu: ");
        int inputan = InputUser.nextInt();
        eventorganizer[] tamuanda = new eventorganizer[inputan];
        infotamuyangada(tamuanda);
    }


    public static void infotamuyangada(eventorganizer[] tamulobi) {
        Scanner inputtamu = new Scanner(System.in);
        for (int index = 0; index < tamulobi.length; index++) {
            tamulobi[index] = new eventorganizer();
            System.out.println("1. masukan nomor ID :");
            int inputid = inputtamu.nextInt();
            System.out.print("2. Masukkan  Nama: ");
            String inputNama = inputtamu.next();
            System.out.print("3. Masukkan alamat tamu: ");
            String inputAlamat = inputtamu.next();
            System.out.print("4. Masukkan Email: ");
            String inputEmail = inputtamu.next();
            System.out.print("5. Masukkan no handPhone: ");
            int inputnohp = inputtamu.nextInt();
            System.out.print("=======terima kasih sudah mengisi======");
            String pilih = inputtamu.nextLine();
            if (pilih.contains("1")) {
            } else {
                System.out.println();
                System.out.println("(lanjut mengisi daftr tamu ketik angka (1) untuk menampilkan hasil)");

                String orang = inputtamu.next();
                if (orang.contains("1")) {
                    tamulobi[index] = new eventorganizer(inputid, inputNama, inputAlamat, inputEmail, inputnohp);
                    tamulobi[index].PrintGuests(tamulobi);
                } else {
                    System.out.println(inputtamu);
                    break;


                }
            }
        }
    }

    private static void menu() {
        Scanner inputtamudatang = new Scanner(System.in);
        System.out.println("1.\tmasuk :");
        System.out.println("2.\tkeluar :");
        System.out.println("silahkan pilih :");
        String input = inputtamudatang.next();
        switch (input) {
            case "1" -> absenkuota();
            case "2" -> System.exit(0);
        }

    }
}
//maaf pak masih bingung cara nginput satu satu

