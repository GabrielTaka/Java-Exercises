package br.com.fatec.engine;

import java.util.Scanner;

public class Inicio {

	public static void main(String args[]) {
		Agenda agenda = new Agenda();
		Scanner scanner = new Scanner(System.in);

		byte opcao = 0;
		byte sair = 10;

		while (sair != 0) {
			switch (opcao) {
			case 0:
				agenda.inicio();
				opcao = scanner.nextByte();
				break;

			case 1:
				agenda.cadastrarAluno();
				opcao = 0;
				break;

			case 2:
				agenda.cadastrarProfessor();
				opcao = 0;
				break;

			case 3:
				agenda.ListarAluno();
				opcao = 0;
				break;
			
			case 4:
				agenda.ListarProfessor();
				opcao = 0;
				break;
			case 5:
				agenda.editarAluno();
				opcao = 0;
				break;
			case 6:
				agenda.editarProfessor();
				opcao = 0;
				break;
			case 7:
				agenda.excluir();
				opcao = 0;
				break;
			case 8:
				sair = 0;
			default:
				agenda.inicio();
				opcao = scanner.nextByte();
				break;
			}
		}
	}
}
