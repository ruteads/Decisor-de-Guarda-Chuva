import java.util.Scanner;

public class GuardaChuva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Está chovendo? (sim/não)");
        String resposta = scanner.nextLine();

        if (resposta.equals("sim")) {
            System.out.println("Leve o guarda-chuva!");
        } else {
            System.out.println("Pode sair sem guarda-chuva!");
        }

        scanner.close();
    }
}
