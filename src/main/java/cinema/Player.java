package cinema;

public class Player {

    private boolean ligado = false;
    private boolean tocando = false;
    private String filme = "";

    public String ligar() {
        ligado = true;
        return "Player ligado";
    }

    public String reproduzir(String filme) {
        this.filme = filme;
        this.tocando = true;
        return "Reproduzindo: " + filme;
    }

    public String parar() {
        this.tocando = false;
        return "Reprodução encerrada";
    }

    public String desligar() {
        ligado = false;
        return "Player desligado";
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public String getFilme() {
        return filme;
    }
}
