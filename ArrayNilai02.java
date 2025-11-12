import java.util.Scanner;
public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int[] nilaiAkhir = new int[10];
 
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai akhir ke-"+i+": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 70; i++) {
            if (nilaiAkhir[i] >= 75) {
                System.out.println("Nilai akhir mahasiswa ke-"+i+" adalah: " + nilaiAkhir[i] + " (Lulus)");
            } else {
                System.out.println("Nilai akhir mahasiswa ke-"+i+" adalah: " + nilaiAkhir[i] + " (Tidak Lulus)");
            }
            
        }
    }
    
}
