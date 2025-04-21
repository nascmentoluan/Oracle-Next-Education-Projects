package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private double duracaoEmMinutos;
    private double somaDasAvaliacoes = 0;
    private double totalAvaliacoes = 0;
    private double resultadoAvaliacoes;
    private boolean incluidoNoPlano;


    public void exibirFichaTecnica() {
        System.out.println("Nome do Título: " + nome +
                "\nAno de Lançamento: " + anoDeLancamento +
                "\nDuração (Em Minutos): " + duracaoEmMinutos +
                "\nAvaliação: " + resultadoAvaliacoes +
                "\nIncluído no Plano: " + incluidoNoPlano);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getTotalAvaliacoes() {
        return this.totalAvaliacoes;
    }

    public void avaliarFilme(double notaDoFilme) {
        totalAvaliacoes++;
        somaDasAvaliacoes += notaDoFilme;
    }

    public double pegarMedia() {
        resultadoAvaliacoes = somaDasAvaliacoes / totalAvaliacoes;
        return resultadoAvaliacoes;
    }
}
