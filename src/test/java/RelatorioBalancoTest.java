import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.IRelatorio;
import padroescriacao.factorymethod.RelatorioBalanco;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioBalancoTest {
    @Test
    void deveGerarBalanco() {
        IRelatorio relatorio = new RelatorioBalanco();
        assertEquals("Balanço gerado", relatorio.gerar());
    }
    @Test
    void deveCancelarBalanco() {
        IRelatorio relatorio = new RelatorioBalanco();
        assertEquals("Balanço cancelado", relatorio.cancelar());
    }
}
