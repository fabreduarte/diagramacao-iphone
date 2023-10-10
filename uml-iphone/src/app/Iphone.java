package app;

import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

public class Iphone implements Telefone, NavegadorInternet, ReprodutorMusical {

	// musica
	public void play() {
		System.out.println("Dando play na música");
	}

	public void pausar() {
		System.out.println("Pausando música");
	}

	public void trocarMusica() {
		System.out.println("Trocando de música");
	}

	// internet

	public void checarConexao() {
		System.out.println("Checando conexão com a internet");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página da internet");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	public void novaAba() {
		System.out.println("Abrindo nova Aba");
	}

	public void mudarDePagina() {
		System.out.println("Mudando de Página");
	}

	// telefone

	public void ligar() {
		System.out.println("Ligando");
	}

	public void atender() {
		System.out.println("Atendendo Ligação");
	}

	public void caixaEletronica() {
		System.out.println("Acessando mensagens na caixa eletrônica");
	}

	@Override
	public String[] getMusicas() {
		throw new UnsupportedOperationException("Pegando músicas");
	}

	@Override
	public String[] getContatos() {
		throw new UnsupportedOperationException("Pegando Contatos");
	}

}
