import java.util.Scanner;
public class Estudos {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem-vindo ao impressor de anotações! Por favor, digite seus rascunhos: ");
        String anotacoesDeEstudos = ler.nextLine();
        System.out.println("O que você digitou até o momento foi: " + anotacoesDeEstudos);

    }
}
