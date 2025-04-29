import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Client Menu =====");
            System.out.println("1. Register client");
            System.out.println("2. View all clients");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    Client client = new Client();

                    System.out.print("Enter client name: ");
                    client.name = scanner.nextLine();

                    // CPF validation
                    while (true) {
                        System.out.print("Enter CPF (11 digits only): ");
                        String cpfInput = scanner.nextLine();
                        if (cpfInput.matches("\\d{11}")) {
                            client.cpf = cpfInput;
                            break;
                        } else {
                            System.out.println("⚠️ Invalid CPF. Must contain exactly 11 digits.");
                        }
                    }

                    // Age validation
                    while (true) {
                        System.out.print("Enter client age: ");
                        String ageInput = scanner.nextLine();
                        try {
                            int age = Integer.parseInt(ageInput);
                            if (age >= 0) {
                                client.age = age;
                                break;
                            } else {
                                System.out.println("⚠️ Age cannot be negative.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("⚠️ Invalid age. Please enter numbers only.");
                        }
                    }

                    clients.add(client); // Add to the list
                    System.out.println("✅ Client registered successfully!");
                    break;

                case "2":
                    if (clients.isEmpty()) {
                        System.out.println("⚠️ No clients registered yet.");
                    } else {
                        System.out.println("\n--- Registered Clients ---");
                        for (Client c : clients) {
                            c.displayInfo();
                        }
                    }
                    break;

                case "3":
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid option. Please try again.");
            }
        }
    }
}
