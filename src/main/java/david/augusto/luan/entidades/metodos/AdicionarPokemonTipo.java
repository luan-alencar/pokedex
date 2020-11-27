package david.augusto.luan.entidades.metodos;

import david.augusto.luan.entidades.Data;
import david.augusto.luan.entidades.PokeDex;
import david.augusto.luan.entidades.Pokemon;
import david.augusto.luan.entidades.Tipo;

public class AdicionarPokemonTipo extends PokeDex {

	public void adicionarPokemon(String nome, Tipo tipo, Data diaCaptura) {
		Pokemon p = new Pokemon(nome, tipo, diaCaptura);
		this.getPokemons().add(p);
	}
}
