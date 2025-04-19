public class Filme{
    String nome;
    int anoDeLancamento;
    double duracaoEmMinutos, somaDasAvaliacoes = 0, totalAvaliacoes = 0, resultadoAvaliacoes;
    boolean incluidoNoPlano;


    void exibirFichaTecnica(){
        System.out.println("Nome do Filme: " + nome +
                "\nAno de Lançamento: " + anoDeLancamento +
                "\nDuração (Em Minutos): " + duracaoEmMinutos +
                "\nAvaliação: " + resultadoAvaliacoes +
                "\nIncluído no Plano: " + incluidoNoPlano);
    }

    void avaliarFilme(double notaDoFilme){
        totalAvaliacoes++;
        somaDasAvaliacoes += notaDoFilme;
    }

    double pegarMedia(){
        resultadoAvaliacoes = somaDasAvaliacoes / totalAvaliacoes;
        return resultadoAvaliacoes;
    }
}