import org.example.Equipe;
import org.example.Censo;
import org.example.Jogador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarTotalJogadoresLesionados() {
        Equipe equipe = new Equipe(
                new Jogador("Paulinho", true),
                new Jogador("Jair", true),
                new Jogador("Coutinho", false)
        );
        assertEquals(2, Censo.contarTotalJogadoresLesionados(equipe));
    }

    @Test
    void deveContarTotalJogadoresEquipeo() {
        Equipe equipe = new Equipe(
                new Jogador("Paulinho", true),
                new Jogador("Jair", true),
                new Jogador("Coutinho", false),
                new Jogador("João Victor", true)
        );
        assertEquals(4, Censo.contarTotalJogadoresEquipe(equipe));
    }

}