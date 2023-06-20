import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegiaoTest {

    @Test
    void deveContarUsuariosBanidosServidor() {
        Servidor servidor = new Servidor(
                new Usuario("Marco", true),
                new Usuario("Antonio", true),
                new Usuario("Jose", false),
                new Usuario("Maria", true)
        );
        assertEquals(3, Regiao.contarUsuariosBanidosServidor(servidor));
    }

    @Test
    void deveContarTotalUsuariosServidor() {
        Servidor servidor = new Servidor(
                new Usuario("Marco", true),
                new Usuario("Antonio", true),
                new Usuario("Jose", false),
                new Usuario("Maria", true)
        );
        assertEquals(4, Regiao.contarTotalUsuariosBanidos(servidor));
    }

}