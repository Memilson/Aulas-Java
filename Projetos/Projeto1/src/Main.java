import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Screen();
        Random userTicket = new Random();
        int userTicketNumber = userTicket.nextInt(100);
        String userID, userProblem, techName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        userID = scanner.nextLine();

        System.out.println("Qual seu problema?");
        userProblem = scanner.nextLine();

        System.out.println("Escolha o técnico (Angelo, James, John, Aleatorio):");
        techName = scanner.nextLine();

        switch (techName) {
            case "Angelo":
                System.out.println("Técnico escolhido: Angelo");
                break;
            case "James":
                System.out.println("Técnico escolhido: James");
                break;
            case "John":
                System.out.println("Técnico escolhido: John");
                break;
            case "Aleatorio":
                System.out.println("Técnico escolhido: Aleatorio");
                break;
            default:
                System.out.println("Técnico não encontrado.");
                break;
        }

        System.out.println("Seu nome: " + userID);
        System.out.println("Ticket: " + userTicketNumber);
        System.out.println("Problema enviado para a equipe de suporte: " + userProblem);
    }
}
