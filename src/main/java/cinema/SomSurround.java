package cinema;

public class SomSurround {

    private boolean ligado = false;
    private int volume = 0;

    public String ligar() {
        ligado = true;
        return "Som surround ligado";
    }

    public String desligar() {
        ligado = false;
        return "Som surround desligado";
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVolume() {
        return volume;
    }
}
