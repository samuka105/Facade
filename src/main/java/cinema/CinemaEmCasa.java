package cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaEmCasa {

    private Projetor projetor = new Projetor();
    private Tela tela = new Tela();
    private SomSurround som = new SomSurround();
    private Luzes luzes = new Luzes();
    private Player player = new Player();

    public List<String> assistirFilme(String filme) {
        List<String> passos = new ArrayList<String>();
        passos.add(luzes.escurecer());
        passos.add(tela.descer());
        passos.add(projetor.ligar());
        projetor.setEntrada("HDMI");
        passos.add(som.ligar());
        som.setVolume(20);
        passos.add(player.ligar());
        passos.add(player.reproduzir(filme));
        return passos;
    }

    public List<String> desligar() {
        List<String> passos = new ArrayList<String>();
        passos.add(player.parar());
        passos.add(player.desligar());
        passos.add(som.desligar());
        passos.add(projetor.desligar());
        passos.add(tela.subir());
        passos.add(luzes.acender());
        return passos;
    }

    public Projetor getProjetor() {
        return projetor;
    }

    public Tela getTela() {
        return tela;
    }

    public SomSurround getSom() {
        return som;
    }

    public Luzes getLuzes() {
        return luzes;
    }

    public Player getPlayer() {
        return player;
    }
}
