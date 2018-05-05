package br.com.modelo.engine;
import br.com.modelo.model.Produto;
import br.com.modelo.model.ProdutoGenerico;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CadastrarProduto {
	Scanner scanner;
	private ArrayList<ProdutoGenerico> produtos;
	private List<ProdutoGenerico> produtosVenda;

	public CadastrarProduto() {
		scanner = new Scanner(System.in);
		produtos = new ArrayList<>();
		produtosVenda = new ArrayList<>();
	}

	public void cadastrar() {
		System.out.println("\nInsira o nome do Produto: ");
		String nomeProduto = scanner.next();
		System.out.println("Quantidade do produto: ");
		int quantidade = scanner.nextInt();
		System.out.println("Valor unitário: ");
		double valor = scanner.nextDouble();
		System.out.println("Identificador do produto: ");
		int id = scanner.nextInt();
		System.out.println("\n");

		ProdutoGenerico produto = new ProdutoGenerico(nomeProduto, quantidade, valor, id);

		produtos.add(produto);
	}

	public void listar() {
		System.out.println("                            ---- Produtos em estoque ---- \n");
		for (ProdutoGenerico produto : produtos) {
			if (produto.getEspecificacoes() != null) {
				System.out
						.println(produto.dadosFormatados() + "\nEspecificações: " + produto.getEspecificacoes() + "\n");
			} else {
				System.out.println(produto.dadosFormatados() + "\n");
			}
		}
	}

	public void vender() {
		System.out.println("\nInsira o ID do produto a ser vendido: ");
		int id = scanner.nextInt();
		System.out.println("Quantidade a ser vendida: ");
		int quantidade = scanner.nextInt();
		ProdutoGenerico produtoVendas = new ProdutoGenerico(quantidade, id);
		produtosVenda.add(produtoVendas);

		for (ProdutoGenerico produto : produtos) {
			if (produto.getIndex() == id) {
				produto.setEstoque(produto.getEstoque() - quantidade);
				produto.setTotalVendido(produto.getTotalVendido() + quantidade);
			}
		}

		System.out.println("\n");
	}

	public void registrar() {
		String caminho = "C:\\Users\\Gabriel\\Desktop\\Resgistros E-commerce";

		File pasta = new File(caminho);

		pasta.mkdir();

		System.out.println("Deseja registrar\n<1> Quantidade em estoque \n<2> Vendas de produtos");
		String escolha = scanner.next();

		try {
			if (escolha.equals("1") || escolha.toLowerCase().equals("estoque")) {
				String caminho1 = "C:\\Users\\Gabriel\\Desktop\\Resgistros E-commerce\\Registro Estoque.txt";
				int total = 0;
				File arquivo = new File(caminho1);
				FileWriter escritor = new FileWriter(arquivo, true);
				BufferedWriter escritorBuffer = new BufferedWriter(escritor);

				for (ProdutoGenerico produto : produtos) {
					escritorBuffer.newLine();
					escritorBuffer.write("Produto: " + produto.getNomeProduto());
					escritorBuffer.newLine();
					escritorBuffer.write("Quantidade: " + produto.getEstoque());
					escritorBuffer.newLine();
					escritorBuffer.write("-------------------------------------------------");
					total += produto.getEstoque();
					escritorBuffer.newLine();
				}
				escritorBuffer.write("Quantidade total de produtos em estoque: " + total);
				salvarDados();
				escritorBuffer.close();
				escritor.close();
			} else if (escolha.equals("2") || escolha.toLowerCase().equals("vendas")) {
				String caminho1 = "C:\\Users\\Gabriel\\Desktop\\Resgistros E-commerce\\Registro Vendas.txt";
				int total = 0;
				File arquivo = new File(caminho1);
				FileWriter escritor = new FileWriter(arquivo);
				BufferedWriter escritorBuffer = new BufferedWriter(escritor);
				for (ProdutoGenerico produto : produtosVenda) {
					System.out.println(produto.getTotalVendido());
					escritorBuffer.newLine();
					escritorBuffer.write("Id: " + produto.getIndex());
					escritorBuffer.newLine();
					escritorBuffer.write("Vendidos: " + produto.getTotalVendido());
					escritorBuffer.newLine();
					total += produto.getTotalVendido();
					escritorBuffer.newLine();
					escritorBuffer.write("-------------------------------------------------");
					escritorBuffer.newLine();
				}
				salvarDados();
				escritorBuffer.write("Total de itens vendidos: " + total);
				escritorBuffer.close();
				escritor.close();

			}

		} catch (IOException ex) {
			System.out.println("Não foi possível salvar o registro");
		}

	}

	private final void salvarDados() {

		try {

			String caminhoArquivo = "C:\\Users\\Gabriel\\Desktop\\Resgistros E-commerce\\Registrar Produto.txt";
			File arquivo = new File(caminhoArquivo);
			FileWriter escritor = new FileWriter(arquivo, true);

			BufferedWriter bufferEscritor = new BufferedWriter(escritor);

			for (ProdutoGenerico produto : produtos) {
				bufferEscritor.newLine();
				bufferEscritor.write("Nome:" + produto.getNomeProduto());
				bufferEscritor.newLine();
				bufferEscritor.write("Valor:" + (int) produto.getValorProduto());
				bufferEscritor.newLine();
				bufferEscritor.write("Estoque:" + produto.getEstoque());
				bufferEscritor.newLine();
				bufferEscritor.write("Especificações:" + produto.getEspecificacoes());
				bufferEscritor.newLine();
				bufferEscritor.write("Index:" + produto.getIndex());
				bufferEscritor.newLine();
				bufferEscritor.write("Total vendido:" + produto.getTotalVendido());
				bufferEscritor.newLine();
				bufferEscritor.write("-------------------------------");
				bufferEscritor.newLine();

			}

			bufferEscritor.close();
			escritor.close();

		} catch (IOException ex) {

		}
	}

	public void totalVendidos() {
		int total = 0;
		for (ProdutoGenerico produto : produtos) {
			total += produto.getTotalVendido();
		}
		System.out.println("Quantidade total de produtos vendidos: " + total + "\n");
	}

	public void comentar() {
		int id;
		System.out.printf("Id do produto para comentário: ");
		id = scanner.nextInt();
		System.out.printf("Insira o seu comentário: ");
		String comentario;
		comentario = scanner.next();

		for (ProdutoGenerico produto : produtos) {
			if (id == produto.getIndex()) {
				produto.setEspecificacoes(comentario);
			}
		}

		salvarDados();
	}

	public void recomendar() {
		ProdutoGenerico max = produtos.get(0);
		int total = max.getEstoque();
		for (ProdutoGenerico produto : produtos) {
			if (total > produto.getEstoque()) {
				total = produto.getEstoque();
			}
		}
		for (ProdutoGenerico produto : produtos) {
			if (total == produto.getEstoque()) {
				System.out.println("O produto " + produto.getNomeProduto() + " está com estoque muito baixo { "+ produto.getEstoque() + " }");
			}
		}
	}

	public ArrayList<ProdutoGenerico> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ProdutoGenerico> produtos) {
		this.produtos = produtos;
	}
}
