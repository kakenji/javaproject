

public class Cachorro extends Animal{
	private String porte;
	private boolean vacinado = false;

	public Cachorro(int id, String nome, int idade, String raca, String sexo, String observacoes, String porte) {
		super(id, nome, idade, raca, sexo, observacoes);
		this.porte = porte;
	}
	
	public String toString() {
		return super.toString() + ";Porte: " + porte + ";Vacinado: " + vacinado;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
}
