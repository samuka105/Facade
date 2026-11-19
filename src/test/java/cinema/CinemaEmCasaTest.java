package cinema;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CinemaEmCasaTest {

    @Test
    public void testAssistirLigaProjetorNaEntradaCerta() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        cinema.assistirFilme("Interestelar");
        assertTrue(cinema.getProjetor().isLigado());
        assertEquals("HDMI", cinema.getProjetor().getEntrada());
    }

    @Test
    public void testAssistirDesceTela() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        cinema.assistirFilme("Interestelar");
        assertTrue(cinema.getTela().isDescida());
    }

    @Test
    public void testAssistirEscureceLuzes() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        cinema.assistirFilme("Interestelar");
        assertEquals(10, cinema.getLuzes().getNivel());
    }

    @Test
    public void testAssistirLigaSomComVolume() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        cinema.assistirFilme("Interestelar");
        assertTrue(cinema.getSom().isLigado());
        assertEquals(20, cinema.getSom().getVolume());
    }

    @Test
    public void testAssistirReproduzOFilme() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        cinema.assistirFilme("Interestelar");
        assertTrue(cinema.getPlayer().isTocando());
        assertEquals("Interestelar", cinema.getPlayer().getFilme());
    }

    @Test
    public void testAssistirRetornaTodosOsPassos() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        List<String> passos = cinema.assistirFilme("Interestelar");
        assertEquals(6, passos.size());
        assertEquals("Reproduzindo: Interestelar", passos.get(passos.size() - 1));
    }

    @Test
    public void testDesligarReverteTudo() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        cinema.assistirFilme("Interestelar");
        cinema.desligar();

        assertFalse(cinema.getProjetor().isLigado());
        assertFalse(cinema.getSom().isLigado());
        assertFalse(cinema.getTela().isDescida());
        assertFalse(cinema.getPlayer().isTocando());
        assertEquals(100, cinema.getLuzes().getNivel());
    }

    @Test
    public void testEstadoInicialDesligado() {
        CinemaEmCasa cinema = new CinemaEmCasa();
        assertFalse(cinema.getProjetor().isLigado());
        assertFalse(cinema.getTela().isDescida());
        assertEquals(100, cinema.getLuzes().getNivel());
    }
}
