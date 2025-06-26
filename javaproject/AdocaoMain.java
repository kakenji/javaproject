
public class AdocaoMain {
	public static void main(String[] args) {
		Cachorro c = new Cachorro(1, "Bob", 12, "Vira-Lata", "Masculino", "Nada a observar", "Grande");
		Passaro p = new Passaro(2, "Bird", 1, "Calopsita", "Feminino", "Nada ", true, "Redondo");
		Pessoa pessoa = new Pessoa(10, "Kayky", "00000000000", "111111", "Rua das flores");
		Adocao adocao = new Adocao();
		
		adocao.cadastrarAnimal(c);
		adocao.cadastrarAnimal(p);
		adocao.cadastrarPessoa(pessoa);
//		adocao.listarAnimais();
		
//		adocao.buscarPorIdade(12);
		adocao.buscarPorObservacoes("Nada a observar");
//		adocao.realizarAdocao(1, 10);
		
	}
}
