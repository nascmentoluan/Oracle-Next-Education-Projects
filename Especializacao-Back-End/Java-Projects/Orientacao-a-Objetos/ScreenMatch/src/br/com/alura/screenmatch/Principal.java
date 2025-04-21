package br.com.alura.screenmatch;
import br.com.alura.screenmatch.modelos.Serie;


import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        Filme novoFilme = new Filme();
        novoFilme.setNome(leitura.nextLine());
        novoFilme.setAnoDeLancamento(leitura.nextInt());
        novoFilme.setDuracaoEmMinutos(leitura.nextDouble());
        novoFilme.setIncluidoNoPlano(leitura.nextBoolean());

        novoFilme.avaliarFilme(leitura.nextDouble());
        novoFilme.pegarMedia();
        novoFilme.exibirFichaTecnica();
        System.out.println("Total de Avaliações: " + novoFilme.getTotalAvaliacoes());


        Serie novaSerie = new Serie();
        novaSerie.setNome(leitura.nextLine());
        leitura.nextLine();
        novaSerie.setAnoDeLancamento(leitura.nextInt());
        novaSerie.setNumDeTemporadas(leitura.nextInt());
        novaSerie.setEpisodiosPorTemporada(leitura.nextInt());
        novaSerie.setMinutosPorEpisodio(leitura.nextDouble());
        novaSerie.setAtiva(leitura.nextBoolean());
        novaSerie.setIncluidoNoPlano(leitura.nextBoolean());
        novaSerie.exibirFichaTecnica();
        System.out.println("Duração total de minutos da Série: " + novaSerie.getDuracaoEmMinutos());


        CalculadoraTempo calculo = new CalculadoraTempo();

        calculo.incluirTempo(novaSerie);
        System.out.println(calculo.getTempoTotal());



        leitura.close();
    }
}
