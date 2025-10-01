import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.*;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioFactoryTest {
    @Test
    void deveRetornarRelatorioBalanco() {
        try {
            IRelatorio relatorio = RelatorioFactory.obterRelatorio("Balanco");
        }catch (IllegalArgumentException e) {
            assertEquals("Relatório inexistente", e.getMessage());
        }
    }
    @Test
    void deveRetornarRelatorioDemonstrativoResultado() {
        try {
            IRelatorio relatorio = RelatorioFactory.obterRelatorio("DemonstrativoResultado");
        } catch (IllegalArgumentException e){
            assertEquals("Relatório inexistente", e.getMessage());
        }
    }
    @Test
    void deveRetornarRelatorioFluxoCaixa() {
        try{
            IRelatorio relatorio = RelatorioFactory.obterRelatorio("FluxoCaixa");
        } catch (IllegalArgumentException e){
            assertEquals("Relatório inexistente", e.getMessage());
        }
    }
    @Test
    void deveRetornarRelatorioInvestimento() {
        try{
            IRelatorio relatorio = RelatorioFactory.obterRelatorio("Investimento");
        } catch (IllegalArgumentException e){
            assertEquals("Relatório inexistente", e.getMessage());
        }
    }
}
