package br.com.fatec.engine;
import java.util.ArrayList;
import java.util.Scanner;
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
		System.out.println("Insira o nome do aluno: ");
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
