package david.augusto.luan.interfaces;

import java.util.List;

import david.augusto.luan.entidades.Data;
import david.augusto.luan.entidades.Pokemon;
import david.augusto.luan.entidades.Tipo;
import david.augusto.luan.exceptions.PokemonInexistenteException;

public interface PokemonInterface {

	public void adicionarPokemon(Pokemon pokemon);

	public void adicionarPokemon(String nome, Tipo tipo, Data diaCaptura);

	public int getQuantidadePokemons();

	public int getQuantidadePokemonTipo(Tipo tipo);

	public List<Pokemon> getPokemonsPorTipo(Tipo tipo);

	public List<Pokemon> getPokemonsCapturados(Data dia);

	public Pokemon getPokemonMaisAntigo();

	public Tipo getTipoPokemonPredominante();

	public List<Pokemon> removerPokemons(Tipo tipo);

	public List<Pokemon> acharPokemonPorNome(String nome);

	public void removerPokemons(Pokemon p) throws PokemonInexistenteException;
}
