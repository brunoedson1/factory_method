package padroescriacao.factorymethod;

public class RelatorioBalanco implements IRelatorio {
    public String gerar() {
        return "Balanço gerado";
    }
    public String cancelar() {
        return "Balanço cancelado";
    }
}
