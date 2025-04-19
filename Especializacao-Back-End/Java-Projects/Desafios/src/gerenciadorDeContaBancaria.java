import java.util.Scanner;

public class gerenciadorDeContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 0;

        System.out.println("Digite o seu nome: ");
        String nomeCliente = leitura.nextLine();

        System.out.println("*************************************************************\n" +
                "Bem-vindo(a) ao CodeBank! Confira os seus dados abaixo: \n\n" +
                "Dados iniciais do cliente: \n\n" +
                "Nome:                     " + nomeCliente + "\n" +
                "Tipo conta:               Corrente" +
                "\nSaldo inicial:            R$ " + saldo +
                "\n*************************************************************");

        int validadorResposta = 0;
        do {
            System.out.println("\nOperações" +
                    "\n" +
                    "\n1 - Consultar saldos" +
                    "\n2 - Receber valor" +
                    "\n3 - Transferir valor" +
                    "\n4 - Sair" +
                    "\nDigite a opção desejada:");

            validadorResposta = leitura.nextInt();


            switch (validadorResposta){
                case 1:
                    System.out.println("O saldo atual é de R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorAdicionado = leitura.nextDouble();
                    saldo += valorAdicionado;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que você deseja transferir:");
                    double valorRetirado = leitura.nextDouble();
                    if (valorRetirado <= saldo){
                        saldo -= valorRetirado;
                        System.out.println("Saldo restante R$ " + saldo);
                    } else {
                        System.out.println("Não foi possível realizar a transferência!\n" +
                                "\nO valor digitado é maior que seu saldo." +
                                "\nCaso possua saldo digite o valor menor ou igual para fazer uma transferência.");
                    }
                    break;
                case 4:
                    System.out.println("Até Logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, digite um dos valores requisitados acima!");
            }

        } while (validadorResposta != 4);

    }
}