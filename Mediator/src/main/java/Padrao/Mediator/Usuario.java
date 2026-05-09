package Padrao.Mediator;

public class Usuario {

    public String reclamarSuporte(String mensagem) {
        return CentralAtendimento.getInstancia().receberReclamacaoSuporte(mensagem);
    }

    public String elogiarSuporte(String mensagem) {
        return CentralAtendimento.getInstancia().receberElogioSuporte(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return CentralAtendimento.getInstancia().receberSugestaoSuporte(mensagem);
    }
}