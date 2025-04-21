package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int numDeTemporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private double minutosPorEpisodio;

    public int getNumDeTemporadas(){
        return numDeTemporadas;
    }

    public void setNumDeTemporadas(int numDeTemporadas){
        this.numDeTemporadas = numDeTemporadas;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public double getMinutosPorEpisodio(){
        return  minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(double minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public double getDuracaoEmMinutos(){
        return numDeTemporadas * minutosPorEpisodio * episodiosPorTemporada;
    }
}
