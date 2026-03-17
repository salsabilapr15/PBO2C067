import java.util.Scanner;

class Karyawan {
    
    private String nama;
    private int id;
    private String jabatan;
    private double gajiPokok;
    private double bonus;

    public Karyawan(String nama, int id, String jabatan, double gajiPokok, double bonus) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
    }

    public double hitungGaji() {
        return this.gajiPokok + this.bonus;
    }

    public void tampilData() {
        System.out.println("\n=== Data Karyawan ===");
        System.out.println("Nama     : " + this.nama);
        System.out.println("ID       : " + this.id);
        System.out.println("Jabatan  : " + this.jabatan);
        System.out.println("Gaji Pokok : " + this.gajiPokok);
        System.out.println("Bonus      : " + this.bonus);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan Bonus: ");
        double bonus = input.nextDouble();

        Karyawan k1 = new Karyawan(nama, id, jabatan, gajiPokok, bonus);

        k1.tampilData();
    }
}
