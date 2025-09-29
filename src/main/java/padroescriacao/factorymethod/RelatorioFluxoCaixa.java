package padroescriacao.factorymethod;

public class RelatorioFluxoCaixa implements IRelatorio {
    public String gerar() {
        return "Fluxo de Caixa gerado";
    }
    public String cancelar() {
        return "Fluxo de Caixa cancelado";
    }
}