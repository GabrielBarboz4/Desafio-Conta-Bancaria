import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Gabriel Garcia Barboza";
        String typeAc = "Corrente";
        double balance = 2000;
        double valorRecebido;
        double valorTransferido;

        System.out.println("******************************** \n");
        System.out.println("Dados iniciais do Cliente: \n");
        System.out.println("Nome:            " + name);
        System.out.println("Tipo de conta:   " + typeAc);
        System.out.println("Saldo:           " + balance);
        System.out.println("\n******************************** \n");

        System.out.println("Operações \n");

        System.out.println("1 - Consultar valores");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair \n");

        System.out.println("Digite qual a opção desejada");
        int valorDigitado = input.nextInt();

        while (valorDigitado != 4) {

            switch (valorDigitado) {

                case 1:
                    System.out.println("O saldo atual é de: R$ " + balance);
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito");
                    valorRecebido = input.nextDouble();
                    balance = valorRecebido + balance;
                    System.out.println("Saldo atualizado: R$ " + balance);
                    break;

                case 3:
                    System.out.println("Digite o valor da transferência");
                    valorTransferido = input.nextDouble();
                    if (valorTransferido > balance) {
                        System.out.println("valor indisponivel para transação");
                    } else {
                        balance = balance - valorTransferido;
                        System.out.println("Saldo atualizado: R$ " + balance);
                    }
                    break;

                default:
                    System.out.println("DIGITE UM VALOR VÁLIDO: valor digitado - " + valorDigitado);
            }

            System.out.println("\n1 - Consultar valores");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair \n");

            System.out.println("Digite qual a opção desejada");

            valorDigitado = input.nextInt();
        }
        }
}
