package cinema;

public class Main {

    public static void main(String[] args) {
        CinemaEmCasa cinema = new CinemaEmCasa();

        System.out.println("== Iniciando sessão ==");
        for (String passo : cinema.assistirFilme("Interestelar")) {
            System.out.println(passo);
        }

        System.out.println();
        System.out.println("== Encerrando sessão ==");
        for (String passo : cinema.desligar()) {
            System.out.println(passo);
        }
    }
}
