//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao14

class Configuracao {

    private static Configuracao instancia;
    private String configuracao;

    private Configuracao() {
        configuracao = "Configuração Padrão";
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}

public class questao14 {
    public static void main(String[] args) {
    
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();

        System.out.println(config1.getConfiguracao());  
        config2.setConfiguracao("Configuração Alterada");
        System.out.println(config1.getConfiguracao());  
    }
}
