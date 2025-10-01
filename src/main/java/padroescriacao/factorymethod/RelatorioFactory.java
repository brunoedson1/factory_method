package padroescriacao.factorymethod;

public class RelatorioFactory {

    public static IRelatorio obterRelatorio(String tipo) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("padroescriacao.factorymethod.Relatorio" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Relatório inexistente: " + tipo, ex);
        }
        if (!(objeto instanceof IRelatorio)) {
            throw new IllegalArgumentException("Classe não implementa IRelatorio");
        }

        return (IRelatorio) objeto;
    }
}
