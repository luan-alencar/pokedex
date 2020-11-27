package david.augusto.luan.interfaces;

import java.util.List;

import david.augusto.luan.entidades.Data;
import david.augusto.luan.entidades.Pokemon;
import david.augusto.luan.entidades.Tipo;
import david.augusto.luan.exceptions.PokemonInexistenteException;

public interface PokemonInterface {

	public abstract void adicionarPokemon(Pokemon pokemon);

	public abstract void adicionarPokemon(String nome, Tipo tipo, Data diaCaptura);

	public abstract int getQuantidadePokemons();

	public abstract int getQuantidadePokemonTipo(Tipo tipo);

	public abstract List<Pokemon> getPokemonsPorTipo(Tipo tipo);

	public abstract List<Pokemon> getPokemonsCapturados(Data dia);

	public abstract Pokemon getPokemonMaisAntigo();

	public abstract Tipo getTipoPokemonPredominante();

	public abstract List<Pokemon> removerPokemons(Tipo tipo);

	public abstract List<Pokemon> acharPokemonPorNome(String nome);

	public abstract void removerPokemons(Pokemon p) throws PokemonInexistenteException;
}
