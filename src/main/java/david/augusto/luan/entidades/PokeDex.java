package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import david.augusto.luan.entidades.metodos.AdicionarPokemon;
import david.augusto.luan.exceptions.PokemonInexistenteException;
import lombok.Getter;

@Getter
public class PokeDex {

	private List<Pokemon> pokemons;

	@Autowired
	protected AdicionarPokemon adicionarPokemon;

	public PokeDex() {
		this.pokemons = new ArrayList<Pokemon>();
	}


	// próximo método a ser transformando em classe
	public int getQuantidadePokemons() {
		return pokemons.size();
	}

	public int getQuantidadePokemonTipo(Tipo tipo) {
		return getPokemonsPorTipo(tipo).size();
	}

	public List<Pokemon> getPokemonsPorTipo(Tipo tipo) {
		List<Pokemon> pokemonsPorTipo = new ArrayList<>();
		for (Pokemon pokemon : pokemons) {
			if (pokemon.getTipo().equals(tipo)) {
				pokemonsPorTipo.add(pokemon);
			}
		}
		return pokemonsPorTipo;
	}

	public List<Pokemon> getPokemonsCapturados(Data dia) {
		List<Pokemon> pokemonsCapturadosNoDia = new ArrayList<>();
		for (Pokemon pokemon : pokemons) {
			if (pokemon.getDiaCaptura().equals(dia)) {
				pokemonsCapturadosNoDia.add(pokemon);
			}
		}
		if (pokemonsCapturadosNoDia.isEmpty()) {
			return null;
		}
		return pokemonsCapturadosNoDia;
	}

	public Pokemon getPokemonMaisAntigo() {
		Pokemon maisAntigo = null;
		for (Pokemon pokemon : pokemons) {
			if (maisAntigo == null) {
				maisAntigo = pokemon;
			}
			if (pokemon.isMaisAntigo(maisAntigo)) {
				maisAntigo = pokemon;
			}
		}
		return maisAntigo;
	}

	public Tipo getTipoPokemonPredominante() {
		Tipo tipo = null; // tipo predominante;
		int quantidadeDeTipoMaior = 0; // quantidade to tipo predominante;
		for (int i = 0; i < pokemons.size(); i++) {
			Pokemon pokemon = pokemons.get(i);
			int quantidadePokemons = getQuantidadePokemonTipo(pokemon.getTipo());

			if (tipo == null) {
				tipo = pokemon.getTipo();
				quantidadeDeTipoMaior = quantidadePokemons;
			} else {
				if (quantidadePokemons > quantidadeDeTipoMaior) {
					tipo = pokemon.getTipo();
					quantidadeDeTipoMaior = quantidadePokemons;
				}
			}
		}
		return tipo;
	}

	public List<Pokemon> removerPokemons(Tipo tipo) {
		List<Pokemon> pokemonsPorTipo = getPokemonsPorTipo(tipo);
		pokemons.removeAll(pokemonsPorTipo);
		return pokemonsPorTipo;
	}

	public List<Pokemon> acharPokemonPorNome(String nome) {
		List<Pokemon> pokemonsPorNome = new ArrayList<>();
		for (Pokemon pokemon : pokemons) {
			if (pokemon.getNome().equals(nome)) {
				pokemonsPorNome.add(pokemon);
			}
		}
		return pokemonsPorNome;
	}

	public void removerPokemons(Pokemon p) throws PokemonInexistenteException {
		Iterator<Pokemon> iterator = pokemons.iterator();
		boolean it = false;
		while (iterator.hasNext()) {
			Pokemon pokemon = iterator.next();
			if (pokemon.getNome().equals(p.getNome())) {
				iterator.remove();
				it = true;
			}
			if (!it) {
				throw new PokemonInexistenteException();
			}
		}
	}
}
