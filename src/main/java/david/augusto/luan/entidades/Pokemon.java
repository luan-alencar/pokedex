package david.augusto.luan.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Pokemon {

	private String nome;
	private Tipo tipo;
	private Data diaCaptura;

	public boolean isMaisAntigo(Pokemon maisAntigo) {
		return true;
	}

}
