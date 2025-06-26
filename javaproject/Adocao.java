import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class Adocao {
//	private ArrayList<Animal> animal = new ArrayList<>();
//	private ArrayList<Pessoa> pessoas = new ArrayList<>();
	private String path = "C:\\Users\\KaykyRibeiro\\OneDrive - amadelli.com\\Área de Trabalho\\database.txt";
	
	public void cadastrarAnimal(Animal a) {
		try {			
			FileWriter file = new FileWriter(path, true);
			BufferedWriter writer = new BufferedWriter(file);
			writer.write(a.toString());
			writer.newLine();
			writer.close();
			System.out.println("Cadastrado com sucesso!");
		}
		catch(IOException e) {
			System.out.println("Erro ao cadastrar animal: " + e.toString());
		}
		
//		try {
//			animal.add(a);
//			System.out.println("Cadastrado com sucesso!");
//		}
//		catch(Error e) {
//			System.out.println(e.toString());
//		}
	}
	
	public void cadastrarPessoa(Pessoa p) {
		try {			
			FileWriter file = new FileWriter(path, true);
			BufferedWriter writer = new BufferedWriter(file);
			writer.write(p.toString());
			writer.newLine();
			writer.close();
			System.out.println("Cadastrado com sucesso!");
		}
		catch(IOException e) {
			System.out.println("Erro ao cadastrar pessoa: " + e.toString());
		}
//		try {
//			pessoas.add(p);
//			System.out.println("Cadastrado com sucesso!");
//		}
//		catch(Error e) {
//			System.out.println(e.toString());
//		}
	}
	
	public void realizarAdocao(int idAnimal, int idPessoa) {
		try {
			File file = new File(path);
			ArrayList<String> linhas = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader(file));
			boolean found = false;
			String linha = "";
			
			while((linha = reader.readLine()) != null) {
				String[] partes = linha.split(";");
				int id = Integer.parseInt(partes[0]);
				
				if(id == idAnimal) {
					boolean adotado = Boolean.parseBoolean(partes[2]);
					if(adotado) {
						System.out.println("O animal " + partes[3] + " já foi adotado!");
						linhas.add(linha);
					}
					else {
						partes[6] = "true";
						partes[1] = String.valueOf(idPessoa);
						String linhaAtualizada = String.join(";", partes);
						linhas.add(linhaAtualizada);
						System.out.println("Adotado com sucesso!");
					}
					found = true;
				}
				else {
					linhas.add(linha);
				}
			}
			reader.close();
			
			if(!found) {
				System.out.println("Animal com ID " + idAnimal + " não encontrado!");
			}
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			for(String l : linhas) {
				writer.write(l);
				writer.newLine();
			}
			writer.close();
			
		}catch(IOException e){
			System.out.println("Erro: " + e.toString());
		}
//		for(int i = 0; i < animal.size(); i++) {
//			if(idAnimal == animal.get(i).getId()) {
//				if(animal.get(i).isAdotado()) {
//					System.out.println("Animal [ " + animal.get(i).getNome() + " ] já foi adotado!");
//				}
//				else {
//					animal.get(i).setAdotado(true);
//					animal.get(i).setAdotadoPor(idPessoa);
//					System.out.println("Adotado com sucesso!");
//				}
//			}
//		}
	}
	
	public void listarAnimais() {
		try {			
			File file = new File(path);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String linha;
			
			while((linha = reader.readLine()) != null) {
				System.out.println(linha);
				if(linha == "\n") {
					System.out.println("\n");
				}
			}
			reader.close();
		}
		catch(IOException e){
			System.out.println("Erro: " + e.toString());
		}
		
//		for(int i = 0; i < animal.size(); i++) {
//			System.out.println(animal.get(i).exibirInformacoes());
//		}
	}
	
	public void buscarPorIdade(int idade) {
		try {			
			File file = new File(path);
			BufferedReader reader = new BufferedReader(new FileReader(file));
		
			ArrayList<Animal> as = new ArrayList<>();
			
			String linha;
			while((linha = reader.readLine()) != null) {
				String[] partes = linha.split(";");
				int com = Integer.parseInt(partes[2]);
				if(com == idade) {
					System.out.println(linha);
				}
			}
			reader.close();
		}catch(IOException e) {
			System.out.println("Erro: " + e.toString());
		}
		
//		ArrayList<Animal> a = new ArrayList<>();
//		for(int i = 0; i < animal.size(); i++) {
//			if(animal.get(i).getIdade() == idade) {
//				a.add(animal.get(i));
//			}
//		}
//		return a;
	}
	
	public void buscarPorObservacoes(String palavraChave){
		try {			
			File file = new File(path);
			BufferedReader reader = new BufferedReader(new FileReader(file));
		
			ArrayList<Animal> as = new ArrayList<>();	
			String linha;
			
			while((linha = reader.readLine()) != null) {
				String[] partes = linha.split(";");
				
				if(partes.length > 5) {
					String ob = partes[5];
					
					if(ob.contains(palavraChave)) {
						System.out.println(linha);
					}					
				}
			}
			reader.close();
		}catch(IOException e) {
			System.out.println("Erro: " + e.toString());
		}
		
		
//		ArrayList<Animal> a = new ArrayList<>();
//		for(Animal ani : animal) {
//			if(ani.getObservacoes().contains(palavraChave)) {
//				a.add(ani);
//			}
//		}
//		return a;
	}
}
