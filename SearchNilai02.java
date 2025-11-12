import java.util.Scanner;
public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int posisi = -1;
        for (int i = 0; i < jumlah; i++) {
            if (nilai[i] == key) {
                posisi = i; 
                break; 
            }
        }
         boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (nilai[i] == key) {
                System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                ditemukan = true;
                break; 
            }
        }
        if (!ditemukan) {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }

    }
    
}
