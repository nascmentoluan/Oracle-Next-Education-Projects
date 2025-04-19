import java.util.Scanner;
public class Perfil {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();

        System.out.println("Olá, " + nome + "! " +
                "Tudo bem?");
    }
}
