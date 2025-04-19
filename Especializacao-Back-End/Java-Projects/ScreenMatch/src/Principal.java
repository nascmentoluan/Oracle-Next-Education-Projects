import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        Filme novoFilme = new Filme();
        novoFilme.nome = leitura.nextLine();
        novoFilme.anoDeLancamento = leitura.nextInt();
        novoFilme.duracaoEmMinutos = leitura.nextDouble();

        novoFilme.avaliarFilme(9);
        novoFilme.pegarMedia();
        novoFilme.exibirFichaTecnica();

        leitura.close();
    }
}
