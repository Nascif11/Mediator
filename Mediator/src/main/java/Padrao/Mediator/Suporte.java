package Padrao.Mediator;

public class Suporte implements Setor {

    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "O Suporte vai analisar a reclamação: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "O Suporte agradece o elogio: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "O Suporte vai analisar a sugestão: " + mensagem;
    }
}