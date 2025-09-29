package padroescriacao.factorymethod;

public class RelatorioInvestimento implements IRelatorio {
    public String gerar() {
        return "Relatório de Investimentos gerado";
    }
    public String cancelar() {
        return "Relatório de Investimentos cancelado";
    }
}
