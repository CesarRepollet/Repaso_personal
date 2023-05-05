import java.util.Scanner;
    public class viviendas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
            numero = scanner.nextInt();
        }
    }
}