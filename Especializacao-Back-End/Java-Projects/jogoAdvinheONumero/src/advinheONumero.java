import java.util.Random;
import java.util.Scanner;

public class advinheONumero {
    public static void main(String[] args){
        Scanner valorASerLido = new Scanner(System.in);
        int valorAleatorioGerado = new Random().nextInt(100), valorTentado = 0, contadorDeTentativas = 5;

        System.out.println("Boas vindas ao mini-game de advinhar números!");
        do{
            System.out.println("Número atual de tentativas: " + contadorDeTentativas);

            if ( contadorDeTentativas == 0 ){
                System.out.println("Você perdeu :( \nO Valor Secreto era: " + valorAleatorioGerado);
                break;
            }
            System.out.println("Tente Advinhar o Valor Secreto e o digite abaixo: ");
            valorTentado = valorASerLido.nextInt();

            if ( valorTentado == valorAleatorioGerado){
                System.out.println("Parabéns! Você acertou o Valor Secreto que era: " + valorAleatorioGerado);
            } else {
                System.out.println("Você errou! Por favor, tente novamente.");
                contadorDeTentativas -= 1;

                if (valorTentado > valorAleatorioGerado){
                    System.out.println("O Valor que você digitou é maior do que o Valor Secreto.");
                } else {
                    System.out.println("O Valor que você digitou é menor do que o valor Secreto");
                }

                if (contadorDeTentativas > 1){
                    System.out.println("Deseja desistir? (Se sim, Digite 'S', para sair");
                    String confirmadorDeSaida = valorASerLido.next();
                    if (confirmadorDeSaida.equals("S")){
                        break;
                    }
                }

            }


        } while ( valorTentado != valorAleatorioGerado);
    }
}
