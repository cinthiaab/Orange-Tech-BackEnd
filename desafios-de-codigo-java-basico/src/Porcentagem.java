import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int tamanho = leitor.nextInt();
            int i = 0;
            while (i < tamanho) {
                System.out.print("/");
                i = i + 1;
            }
        }

    }
}
