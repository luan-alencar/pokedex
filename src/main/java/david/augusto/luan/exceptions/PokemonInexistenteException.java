package david.augusto.luan.exceptions;

public class PokemonInexistenteException extends Exception {
	private static final long serialVersionUID = 1L;

	public PokemonInexistenteException() {
		super("Nenhum pokemon não encontrado!");
	}
}
