import java.util.Scanner;

public class desafioHoraDaPratica2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int valor1, valor2;

        valor1 = leitor.nextInt();

        if ( valor1 > 0){
            System.out.println("Número Positivo.");
        } else {
            System.out.println("Número Negativo.");
        }

        valor2 = leitor.nextInt();

        if ( valor1 > valor2){
            System.out.println("Os números são diferentes; O valor " + valor1 + " é maior do que o " + valor2);
        } else if ( valor2 > valor1){
            System.out.println("Os números são diferentes; O valor " + valor2 + " é maior do que o " + valor1);
        } else {
            System.out.println("Os números são iguais");
        }


        if (valor1 > 0 && valor2 > 0){
            System.out.println("Escolha o que você quer fazer: \n1. Calcular a área do quadrado\n2. Calcular a área do círculo");
            int verificadorDeOpcoes = leitor.nextInt();
            double areaQuadrado, areaCirculo;

            switch (verificadorDeOpcoes){
                case 1:
                    areaQuadrado = (valor1 + valor2) * (valor1 + valor2);
                    System.out.println("O Valor da área é de: "+ areaQuadrado);
                    break;
                case 2:
                    final double PI = 3.14;
                    areaCirculo = (valor1 + valor2) * (valor1 + valor2) * PI;
                    System.out.println("O Valor da área é de: "+ areaCirculo);
            }
        }

        double valorParaTabuada = valor1 + valor2;
        for (int i = 1; i <= 10; i++){
            double resultadoMultiplicacao = valorParaTabuada * i;
            System.out.printf("%.0f * %d = %.0f\n", valorParaTabuada, i, resultadoMultiplicacao);
        }

        for (int j = 0; j <= valorParaTabuada; j++){
            double resultadoFatorial = 1;
            resultadoFatorial *= (valorParaTabuada - j);
            System.out.printf("%.0f\n", resultadoFatorial);
        }
    }
}
