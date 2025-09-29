import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.*;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioFactoryTest {
    @Test
    void deveRetornarRelatorioBalanco() {
        IRelatorio relatorio = RelatorioFactory.obterRelatorio("Balanco");
        assertTrue(relatorio instanceof RelatorioBalanco);
    }
    @Test
    void deveRetornarRelatorioDemonstrativoResultado() {
        IRelatorio relatorio = RelatorioFactory.obterRelatorio("DemonstrativoResultado");
        assertTrue(relatorio instanceof RelatorioDemonstrativoResultado);
    }
    @Test
    void deveRetornarRelatorioFluxoCaixa() {
        IRelatorio relatorio = RelatorioFactory.obterRelatorio("FluxoCaixa");
        assertTrue(relatorio instanceof RelatorioFluxoCaixa);
    }
    @Test
    void deveRetornarRelatorioInvestimento() {
        IRelatorio relatorio = RelatorioFactory.obterRelatorio("Investimento");
        assertTrue(relatorio instanceof RelatorioInvestimento);
    }
    @Test
    void deveRetornarExcecaoParaRelatorioInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RelatorioFactory.obterRelatorio("Patrimonio");
        });
        assertEquals("Relatório inexistente", exception.getMessage());
    }
}
