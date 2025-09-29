package padroescriacao.factorymethod;

public class RelatorioDemonstrativoResultado implements IRelatorio {
    public String gerar() {
        return "Demonstrativo de Resultado gerado";
    }
    public String cancelar() {
        return "Demonstrativo de Resultado cancelado";
    }
}

