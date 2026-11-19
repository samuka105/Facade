package cinema;

public class Luzes {

    private int nivel = 100;

    public String escurecer() {
        nivel = 10;
        return "Luzes diminuídas para 10%";
    }

    public String acender() {
        nivel = 100;
        return "Luzes acesas";
    }

    public int getNivel() {
        return nivel;
    }
}
