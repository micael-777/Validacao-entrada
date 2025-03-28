import java.util.Scanner;

public class senha
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaDigitada;

        do {
            System.out.println("Digite a senha:");
            senhaDigitada = scanner.nextLine();
        } while (!senhaDigitada.equals("Java21"));

        System.out.println("Acesso permitido");
        scanner.close();
    }}