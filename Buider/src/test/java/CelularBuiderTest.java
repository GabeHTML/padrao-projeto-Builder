import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CelularBuiderTest {
    @Test
    void deveRetornarExcecaoParaCelularSemCodigo() {
        try {
            CelularBuilder celularBuilder = new CelularBuilder();
            Celular celular = celularBuilder
                    .setMarca("Xiaomi")
                    .setCriador("Joao")
                    .build();

            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Codigo do Celular inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCelularSemMarca() {
        try {
            CelularBuilder celularBuilder = new CelularBuilder();
            Celular celular = celularBuilder
                    .setCodigo(1)
                    .setCriador("Joao")
                    .build();

            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Marca do Celular inválida", e.getMessage());
        }
    }

    void deveRetornarLivroValido() {
        try {
            CelularBuilder celularBuilder = new CelularBuilder();
            Celular celular = celularBuilder
                    .setCodigo(1)
                    .setMarca("Xiaomi")
                    .setCriador("Joao")
                    .setAno(2010)
                    .build();

            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Celular válido", e.getMessage());
        }
    }

}
