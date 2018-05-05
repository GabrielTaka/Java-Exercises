package br.com.fatec.engine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.rmi.PortableRemoteObject;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Pessoa;
import br.com.fatec.modelo.Professor;

public class Agenda {
	Scanner scanner;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();

	public Agenda() {
		scanner = new Scanner(System.in);
	}

	public void cadastrarAluno() {

		System.out.println("Cadastrando Aluno: ");
		System.out.println("Insira o nome do aluno: ");
		String nome = scanner.next();
		System.out.println("Telefone: ");
		String telefone = scanner.next();
		System.out.println("Email: ");
		String email = scanner.next();
		System.out.println("Número da Matricula: ");
		String numeroDaMatricula = scanner.next();
		Aluno aluno = new Aluno(nome, telefone, email, numeroDaMatricula);

		alunos.add(aluno);

	}

	public void cadastrarProfessor() {

		System.out.println("Cadastrando Professor: ");
		System.out.println("Insira o nome do professor: ");
		String nome = scanner.next();
		System.out.println("Telefone: ");
		String telefone = scanner.next();
		System.out.println("Email: ");
		String email = scanner.next();
		System.out.println("Numero do Registro: ");
		String registro = scanner.next();
		System.out.println("Hora Aula: ");
		String horaAula = scanner.next();

		Pessoa professor = new Professor(nome, telefone, email, registro, horaAula);

		professores.add((Professor) professor);

	}

	public void ListarAluno() {
		System.out.println("Lista de contatos de alunos: ");

		for (Aluno aluno : alunos) {
			System.out.println(aluno.dadosFormatados());
			System.out.println("");

		}

	}

	public void ListarProfessor() {
		System.out.println("Lista de contatos de professores: ");
		for (Professor professor : professores) {
			System.out.println(professor.dadosFormatados());

			System.out.println("");

		}
	}

	public void editarAluno() {
		String nomeAluno;
		System.out.println("Nome do aluno a ser alterado: ");
		nomeAluno = scanner.next();

		for (Aluno aluno : alunos) {
			if (aluno.getNome().toLowerCase().equals(nomeAluno.toLowerCase())) {
				System.out.println("Novo telefone: ");
				aluno.setTelefone(scanner.next());
				System.out.println("Novo Email: ");
				aluno.setEmail(scanner.next());
				System.out.println("N° Matricula");
				aluno.setNumeroDaMatricula(scanner.next());

			}
		}
	}

	public void editarProfessor() {
		String nomeDoProfessor;
		System.out.println("Nome do Professor a ser alterado: ");
		nomeDoProfessor = scanner.next();

		for (Professor professor : professores) {
			if (professor.getNome().toLowerCase().equals(nomeDoProfessor.toLowerCase())) {
				System.out.println("Novo telefone: ");
				professor.setTelefone(scanner.next());
				System.out.println("Novo Email: ");
				professor.setEmail(scanner.next());
				System.out.println("N° do Registro");
				professor.setNumeroRegistro(scanner.next());
				System.out.println("Horas aula: ");
				professor.setQuantidadeHoraAula(scanner.next());
			}
		}
	}

	public void excluir() {
		System.out.println("Deseja excluir aluno ou professor?");
		String escolha = scanner.next();

		if (escolha.toLowerCase().equals("aluno")) {
			System.out.println("N° da Matricula do aluno a ser excluido: ");
			String num = scanner.next();

			for (Aluno aluno : alunos) {
				if (aluno.getNumeroDaMatricula().equals(num))
					alunos.remove(aluno);
			}

		}

		if (escolha.toLowerCase().equals("professor")) {
			System.out.println("N° do registro do professor a ser excluido: ");
			String num = scanner.next();

			for (Professor professor : professores) {
				if (professor.getNumeroRegistro().equals(num))
					professores.remove(professor);

			}

		}
	}

	public void salvarDados() {
		System.out.println("\nDeseja salvar dados de alunos ou professores? \n\n <1> Alunos        <2>Professores");

		String escolha = scanner.next();

		String caminhoPasta = "C:\\Users\\Gabriel\\Desktop\\DadosAgenda";
		File pasta = new File(caminhoPasta);
		pasta.mkdir();

		try {
			if (escolha.equals("1") || escolha.toLowerCase().equals("alunos")) {

				String caminhoArquivo = "C:\\Users\\Gabriel\\Desktop\\DadosAgenda\\Dados Alunos.txt";
				File arquivo = new File(caminhoArquivo);
				FileWriter escritor = new FileWriter(arquivo);

				BufferedWriter bufferEscritor = new BufferedWriter(escritor);

				for (Aluno aluno : alunos) {
					bufferEscritor.newLine();
					bufferEscritor.write(aluno.getNome());
					bufferEscritor.newLine();
					bufferEscritor.write(aluno.getTelefone());
					bufferEscritor.newLine();
					bufferEscritor.write(aluno.getEmail());
					bufferEscritor.newLine();
					bufferEscritor.write(aluno.getNumeroDaMatricula());
					bufferEscritor.newLine();
					
				}

				bufferEscritor.close();
				escritor.close();

				System.out.println("Dados salvos");

			}
			else if(escolha.equals("2") || escolha.toLowerCase().equals("professores")){
				String caminhoArquivo = "C:\\Users\\Gabriel\\Desktop\\DadosAgenda\\Dados Professores.txt";
				File arquivo = new File(caminhoArquivo);
				FileWriter escritor = new FileWriter(arquivo);
				
				BufferedWriter bufferEscritor = new BufferedWriter(escritor);
				
				for (Professor professor : professores) {
					bufferEscritor.newLine();
					bufferEscritor.write(professor.getNome());
					bufferEscritor.newLine();
					bufferEscritor.write(professor.getTelefone());
					bufferEscritor.newLine();
					bufferEscritor.write(professor.getEmail());
					bufferEscritor.newLine();
					bufferEscritor.write(professor.getNumeroRegistro());
					bufferEscritor.newLine();
					bufferEscritor.write(professor.getQuantidadeHoraAula());
					bufferEscritor.newLine();
				}
				
				bufferEscritor.close();
				escritor.close();
			}			
		} catch (IOException ex) {
			System.out.println("\n Não foi possível salvar os dados!");
		}
	}
	
	
	
	@SuppressWarnings("null")
	public void recuperarDados() {
		System.out.println("\nDeseja recuperar dados de alunos ou professores? \n\n <1> Alunos        <2>Professores");
		String escolha = scanner.next();
		
		String nome = null,telefone = null,email = null,registro = null, quantidadeHoraAula = null, numeroRegistro = null;
		try {
			if(escolha.equals("1") || escolha.toLowerCase().equals("alunos")) {
				
				String caminho = "C:\\Users\\Gabriel\\Desktop\\DadosAgenda\\Dados Alunos.txt";
				File arquivo = new File(caminho);
				FileReader leitor = new FileReader(arquivo);
				
				BufferedReader bufferLeitor = new BufferedReader(leitor);
				String linha = bufferLeitor.readLine();
				
				String elementos[];
				
				while(linha != null) {
					elementos = linha.split("  ");		
					
					for (String elemento : elementos) {
						nome = bufferLeitor.readLine();
						telefone = bufferLeitor.readLine();
						email = bufferLeitor.readLine();
						registro = bufferLeitor.readLine();
					}
					alunos.add(new Aluno(nome,telefone,email,registro));
					linha = bufferLeitor.readLine();
				}
				bufferLeitor.close();
				leitor.close();
				
				
				
			}
			else if(escolha.equals("2") || escolha.toLowerCase().equals("professores")) {
				
				String caminhoArquivo = "C:\\Users\\Gabriel\\Desktop\\DadosAgenda\\Dados Professores.txt";
				File canal = new File(caminhoArquivo);
				FileReader leitor = new FileReader(canal);
				
				BufferedReader bufferLeitor = new BufferedReader(leitor);
				
				String linha = bufferLeitor.readLine();
				String elementos[];
				
				while(linha != null) {
					elementos = linha.split(" ");
					
					for (String elemento : elementos) {
						nome = bufferLeitor.readLine();
						telefone = bufferLeitor.readLine();
						email = bufferLeitor.readLine();
						numeroRegistro = bufferLeitor.readLine();
						quantidadeHoraAula = bufferLeitor.readLine();
				
					}
					
					professores.add(new Professor(nome, telefone, email, numeroRegistro, quantidadeHoraAula));
					linha = bufferLeitor.readLine();
				}
				
				bufferLeitor.close();
				leitor.close();
			
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void inicio() {
		Aluno pessoa = new Aluno();
		System.out.println(pessoa.inicio());
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;

	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

}
