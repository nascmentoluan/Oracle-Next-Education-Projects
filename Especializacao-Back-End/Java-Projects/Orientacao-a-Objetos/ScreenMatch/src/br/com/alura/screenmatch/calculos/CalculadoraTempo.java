package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;



public class CalculadoraTempo {
    private double tempoTotal;


    public double getTempoTotal(){
        return  tempoTotal;
    }

    public void setTempoTotal(double tempoTotal){
        this.tempoTotal = tempoTotal;
    }

    public void incluirTempo(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
