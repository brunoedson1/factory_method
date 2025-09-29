import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.IRelatorio;
import padroescriacao.factorymethod.RelatorioDemonstrativoResultado;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioDemonstrativoResultadoTest {
    @Test
    void deveGerarDemonstrativo() {
        IRelatorio relatorio = new RelatorioDemonstrativoResultado();
        assertEquals("Demonstrativo de Resultado gerado", relatorio.gerar());
    }
    @Test
    void deveCancelarDemonstrativo() {
        IRelatorio relatorio = new RelatorioDemonstrativoResultado();
        assertEquals("Demonstrativo de Resultado cancelado", relatorio.cancelar());
    }
}
