import interfaces.*;
public class iPhone implements iPod, Phone, Internet {
    @Override
    public void tocarMuscia() {
        System.out.println("Tocando musica!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a musica!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendi!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
