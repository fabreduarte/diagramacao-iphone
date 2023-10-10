package interfaces;

public interface Telefone {

	String[] getContatos();

	private void ligar() {

	}

	private void atender() {

	}

	private void caixaEletronica() {

	}

}

abstract class Contatos implements Telefone {

	public String[] contatos;

	public Contatos(String[] contatos) {
		this.contatos = contatos;
	}

	@Override
	public String[] getContatos() {
		return contatos;
	}

}
