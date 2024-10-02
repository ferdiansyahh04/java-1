import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        int[] arr = {20, 23, 43, 500, 9, 64};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan index : ");
        int index = scanner.nextInt();

        try {
            System.out.println("Nilai Pada index " + index + " Adalah : " + arr[index]);
            System.out.println("Program Selesai.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan: Indeks tidak valid, melebihi ukuran array.");
            System.out.println("Program Selesai.");
        }
    }
}
