public class iPhone {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public void usarReprodutorMusical() {
        System.out.println("\n*-* Reprodutor Musical *-*");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Rap God - Eminem");
        System.out.println("*-* Fim Reprodutor Musical *-*\n");
    }

    public void usarAparelhoTelefonico() {
        System.out.println("\n*-* Aparelho Telefonico *-*");
        aparelhoTelefonico.ligar("(11)9999-9999");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("*-* Fim Aparelho Telefonico *-*\n");
    }

    public void usarNavegadorInternet() {
        System.out.println("\n*-* Navegador Internet *-*");
        navegadorInternet.exibirPagina("https://github.com/Anbfer/DIO_iPhone_UML");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        System.out.println("*-* Fim Navegador Internet *-*\n");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Demonstração das funcionalidades
        iphone.usarReprodutorMusical();
        iphone.usarAparelhoTelefonico();
        iphone.usarNavegadorInternet();
    }
    
}
