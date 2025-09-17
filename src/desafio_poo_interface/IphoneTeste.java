package desafio_poo_interface;

public class IphoneTeste {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();

		// testando Reprodutor Musical
		meuIphone.selecionarMusica("Imagine - John Lennon");
		meuIphone.tocar();
		meuIphone.pausar();

		// testando Aparelho Telefonico
		meuIphone.ligar("1234-5678");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();

		// testando navegador Intenet

		meuIphone.exibirPagina("www.apple.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();

	}

}
