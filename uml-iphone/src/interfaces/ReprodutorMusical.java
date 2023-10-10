package interfaces;

public interface ReprodutorMusical {

	String[] getMusicas();

	private void play() {
	}

	private void pausar() {
	}

	private void trocarMusica() {
	}

}

abstract class Musicas implements ReprodutorMusical {

	public String[] musicas;

	public Musicas(String[] musicas) {
		this.musicas = musicas;
	}

	@Override
	public String[] getMusicas() {
		return musicas;
	}

}
