import java.util.Scanner;
public class ArrayRataNilai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilai = new int[jumlahMahasiswa];

        int totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            if (nilai[i] > 70) {
                totalLulus += nilai[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilai[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus = (jumlahLulus > 0) ? (double) totalLulus / jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (double) totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("\nRata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    
    }
    
}
