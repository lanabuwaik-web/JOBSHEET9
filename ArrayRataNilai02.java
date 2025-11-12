import java.util.Scanner;
public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     int[] nilai = new int[10];
        int jumlahLulus = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            if (nilai[i] > 70) {
                jumlahLulus++;
            }
        }
        
        System.out.println("\nJumlah mahasiswa yang lulus: " + jumlahLulus);

    
    }
    
}
