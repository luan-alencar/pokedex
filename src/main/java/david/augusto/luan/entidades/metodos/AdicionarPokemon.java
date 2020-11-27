package david.augusto.luan.entidades.metodos;

import david.augusto.luan.entidades.PokeDex;
import david.augusto.luan.entidades.Pokemon;

public class AdicionarPokemon extends PokeDex{


	public void adicionarPokemon(Pokemon p) {
		Pokemon pokemon = p;
		this.getPokemons().add(pokemon);
	}
}
