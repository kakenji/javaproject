import java.util.Scanner;

public class AdocaoMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adocao adocao = new Adocao();
        int opcao = 0;

        while (opcao != 0) {
            System.out.println("\n===== MENU DE ADOÇÃO =====");
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Cadastrar pessoa");
            System.out.println("3 - Listar tudo");
            System.out.println("4 - Realizar adoção");
            System.out.println("5 - Buscar por idade");
            System.out.println("6 - Buscar por observações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                	System.out.println("1 - Cachorro\n2 - Passaro\n3 - Gato\n4 - Coelho");
                	int op2 = scanner.nextInt();
                	if(op2 == 1) {
            			System.out.print("ID: ");
                        int idC = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Nome: ");
                        String nomeC = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idadeC = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Raça: ");
                        String racaC = scanner.nextLine();
                        System.out.print("Sexo: ");
                        String sexoC = scanner.nextLine();
                        System.out.print("Observações: ");
                        String obsC = scanner.nextLine();
                        System.out.print("Porte: ");
                        String porte = scanner.nextLine();
                        System.out.print("Vacinado (true ou false): ");
                        boolean vacinado = scanner.nextBoolean(); scanner.nextLine();
                        Cachorro cachorro = new Cachorro(idC, nomeC, idadeC, racaC, sexoC, obsC, porte);
                        cachorro.setVacinado(vacinado);
                        adocao.cadastrarAnimal(cachorro);
                	} 
                	else if(op2 == 2) {
            			System.out.print("ID: ");
                        int idP = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Nome: ");
                        String nomeP = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idadeP = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Raça: ");
                        String racaP = scanner.nextLine();
                        System.out.print("Sexo: ");
                        String sexoP = scanner.nextLine();
                        System.out.print("Observações: ");
                        String obsP = scanner.nextLine();
                        System.out.print("Sabe cantar (true ou false): ");
                        boolean sabeCantar = scanner.nextBoolean(); scanner.nextLine();
                        System.out.println("Tamanho do bico: ");
                        String tamanhoBico = scanner.next();
                        Passaro passaro = new Passaro(idP, nomeP, idadeP, racaP, sexoP, obsP, sabeCantar, tamanhoBico);
                        passaro.setSabeCantar(sabeCantar);
                        adocao.cadastrarAnimal(passaro);
                	}
                	 else if (op2 == 3) {
                	        System.out.print("ID: ");
                	        int idG = scanner.nextInt(); scanner.nextLine();
                	        System.out.print("Nome: ");
                	        String nomeG = scanner.nextLine();
                	        System.out.print("Idade: ");
                	        int idadeG = scanner.nextInt(); scanner.nextLine();
                	        System.out.print("Raça: ");
                	        String racaG = scanner.nextLine();
                	        System.out.print("Sexo: ");
                	        String sexoG = scanner.nextLine();
                	        System.out.print("Observações: ");
                	        String obsG = scanner.nextLine();
                	        System.out.print("Tipo da pelagem: ");
                	        String pelagem = scanner.nextLine();

                	        Gato gato = new Gato(idG, nomeG, idadeG, racaG, sexoG, obsG, pelagem);
                	        adocao.cadastrarAnimal(gato);
                	    } 
                	 	else if (op2 == 4) {
                	        System.out.print("ID: ");
                	        int idCoelho = scanner.nextInt(); scanner.nextLine();
                	        System.out.print("Nome: ");
                	        String nomeCoelho = scanner.nextLine();
                	        System.out.print("Idade: ");
                	        int idadeCoelho = scanner.nextInt(); scanner.nextLine();
                	        System.out.print("Raça: ");
                	        String racaCoelho = scanner.nextLine();
                	        System.out.print("Sexo: ");
                	        String sexoCoelho = scanner.nextLine();
                	        System.out.print("Observações: ");
                	        String obsCoelho = scanner.nextLine();
                	        System.out.print("Cor da pelagem: ");
                	        String corPelagem = scanner.nextLine();

                	        Coelho coelho = new Coelho(idCoelho, nomeCoelho, idadeCoelho, racaCoelho, sexoCoelho, obsCoelho, corPelagem);
                	        adocao.cadastrarAnimal(coelho);
                	    } else {
                	        System.out.println("Opção inválida.");
                	    }
                	    break;
                	
                case 2:
                    System.out.print("ID: ");
                    int idP = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(idP, nomeP, cpf, telefone, endereco);
                    adocao.cadastrarPessoa(pessoa);
                    break;

                case 3:
                    adocao.listarAnimais();
                    break;

                case 4:
                    System.out.print("ID do animal: ");
                    int idAnimal = scanner.nextInt();
                    System.out.print("ID da pessoa: ");
                    int idPessoa = scanner.nextInt(); scanner.nextLine();
                    adocao.realizarAdocao(idAnimal, idPessoa);
                    break;

                case 5:
                    System.out.print("Idade a buscar: ");
                    int idade = scanner.nextInt(); scanner.nextLine();
                    adocao.buscarPorIdade(idade);
                    break;

                case 6:
                    System.out.print("Palavra-chave nas observações: ");
                    String chave = scanner.nextLine();
                    adocao.buscarPorObservacoes(chave);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
