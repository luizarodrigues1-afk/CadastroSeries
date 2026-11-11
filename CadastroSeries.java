import java.util.Scanner;

public class CadastroSeries {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Capacidade máxima de itens
        final int LIMITE = 10;

        String[] nomes = new String[LIMITE];
        String[] generos = new String[LIMITE];
        int[] anos = new int[LIMITE];

        int totalCadastrados = 0;
        int opcao = 0;

        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1 - Cadastrar nova série");
            System.out.println("2 - Listar séries cadastradas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            if (Scanner.hasNextInt()) {
                opcao = Scanner.nextInt();
                Scanner.nextLine(); // Limpar o buffer do teclado
            } else {
                System.out.println("Opção inválida! Por favor, digite um número.");
                Scanner.nextLine(); // Limpar entrada inválida
                continue;
            }

            switch (opcao) {
                case 1:
                    if (totalCadastrados >= LIMITE) {
                        System.out.println("\n[!] Limite de 10 séries atingido! Não é possível cadastrar mais itens.");
                    } else {
                        System.out.println("\n--- CADASTRO DE SÉRIE (" + (totalCadastrados + 1) + "/" + LIMITE + ") ---");
                        
                        System.out.print("Nome da série: ");
                        nomes[totalCadastrados] = scanner.nextLine();

                        System.out.print("Gênero: ");
                        generos[totalCadastrados] = scanner.nextLine();

                        System.out.print("Ano de lançamento: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Por favor, digite um ano válido (número inteiro).");
                            System.out.print("Ano de lançamento: ");
                            scanner.next();
                        }
                        anos[totalCadastrados] = scanner.nextInt();
                        Scanner.nextLine(); // Limpar o buffer

                        totalCadastrados++;
                        System.out.println("-> Série cadastrada com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE SÉRIES CADASTRADAS ---");
                    if (totalCadastrados == 0) {
                        System.out.println("Nenhuma série cadastrada até o momento.");
                    } else {
                        for (int i = 0; i < totalCadastrados; i++) {
                            System.out.println((i + 1) + ". " + nomes[i] + 
                                               " | Gênero: " + generos[i] + 
                                               " | Ano: " + anos[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nEncerrando a aplicação... Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Escolha entre 1, 2 ou 3.");
                    break;
            }

        } while (opcao != 3);

        Scanner.close();
    }
}
