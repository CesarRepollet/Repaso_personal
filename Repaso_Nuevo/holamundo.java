import java.util.Scanner;
    public class holamundo{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();
            for (int i = 0; i < numero; i++){
                System.out.println("Hola mundo.");
            }
        }
    }
}