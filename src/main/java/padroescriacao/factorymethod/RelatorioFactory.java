package padroescriacao.factorymethod;

public class RelatorioFactory {
    public static IRelatorio obterRelatorio(String tipo) {
        switch (tipo) {
            case "Balanco":
                return new RelatorioBalanco();
            case "DemonstrativoResultado":
                return new RelatorioDemonstrativoResultado();
            case "FluxoCaixa":
                return new RelatorioFluxoCaixa();
            case "Investimento":
                return new RelatorioInvestimento();
            default:
                throw new IllegalArgumentException("Relatório inexistente");
        }
    }
}
