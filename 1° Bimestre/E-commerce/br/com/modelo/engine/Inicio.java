package br.com.modelo.engine;
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

import br.com.modelo.model.Menu;

public class Inicio {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		CadastrarProduto produto = new CadastrarProduto();
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		
		
		byte opcao = 0;
		byte sair = 1;
		
		while(sair != 0) {
			switch (opcao) {
			case 0:
				menu.menu();
				opcao = scanner.nextByte();
				break;
			case 1:
				produto.cadastrar();
				opcao = 0;
				break;
			case 2:
				produto.listar();
				opcao = 0;
				break;
			case 3:
				produto.vender();
				opcao = 0;
				break;
			case 4:
				produto.registrar();
				opcao = 0;
				break;
			case 5:
				produto.comentar();
				opcao = 0;
				break;
			case 6:
				produto.totalVendidos();
				opcao = 0;
				break;
			case 7:
				produto.recomendar();
				opcao = 0;
				break;
			default:
				menu.menu();
				opcao = scanner.nextByte();
				break;
			}
		}
		
	}
}
