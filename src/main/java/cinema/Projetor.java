package cinema;

public class Projetor {

    private boolean ligado = false;
    private String entrada = "";

    public String ligar() {
        ligado = true;
        return "Projetor ligado";
    }

    public String desligar() {
        ligado = false;
        return "Projetor desligado";
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getEntrada() {
        return entrada;
    }
}
