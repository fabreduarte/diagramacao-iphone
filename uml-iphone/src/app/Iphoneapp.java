package app;

public class Iphoneapp {
	public static void main(String[] args) {

		Iphone iphone = new Iphone();

		System.out.println("---------------------------");

		// musica
		iphone.play();
		iphone.pausar();
		iphone.trocarMusica();

		System.out.println("---------------------------");

		// telefone
		iphone.ligar();
		iphone.atender();
		iphone.caixaEletronica();

		System.out.println("---------------------------");

		// internet
		iphone.checarConexao();
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.mudarDePagina();
		iphone.novaAba();

	}

}
