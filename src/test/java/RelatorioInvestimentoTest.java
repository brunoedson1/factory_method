import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.IRelatorio;
import padroescriacao.factorymethod.RelatorioInvestimento;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioInvestimentoTest {
    @Test
    void deveGerarInvestimento() {
        IRelatorio relatorio = new RelatorioInvestimento();
        assertEquals("Relatório de Investimentos gerado", relatorio.gerar());
    }
    @Test
    void deveCancelarInvestimento() {
        IRelatorio relatorio = new RelatorioInvestimento();
        assertEquals("Relatório de Investimentos cancelado", relatorio.cancelar());
    }
}