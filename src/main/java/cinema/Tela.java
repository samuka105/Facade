package cinema;

public class Tela {

    private boolean descida = false;

    public String descer() {
        descida = true;
        return "Tela descida";
    }

    public String subir() {
        descida = false;
        return "Tela recolhida";
    }

    public boolean isDescida() {
        return descida;
    }
}
