import java.util.Scanner;

public class Goteras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner contador1 = new Scanner(System.in);
        int contador = contador1.nextInt();
        int numero = scanner.nextInt();

        for (int i = 0; i < contador; i++) {
            if (numero < 100) {
                System.out.println("00:01:10");
            } else if (numero < 1000) {
                System.out.println("00:30:00");
            } else if (numero < 10000) {
                System.out.println("01:00:00");
            } else if (numero < 100000) {
                System.out.println("10:00:00");
            } else if (numero > 100000) {
                System.out.println("24:00:00");
            }
            numero = scanner.nextInt();
        }
    }
}
