import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.IRelatorio;
import padroescriacao.factorymethod.RelatorioFluxoCaixa;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioFluxoCaixaTest {
    @Test
    void deveGerarFluxoCaixa() {
        IRelatorio relatorio = new RelatorioFluxoCaixa();
        assertEquals("Fluxo de Caixa gerado", relatorio.gerar());
    }
    @Test
    void deveCancelarFluxoCaixa() {
        IRelatorio relatorio = new RelatorioFluxoCaixa();
        assertEquals("Fluxo de Caixa cancelado", relatorio.cancelar());
    }
}
