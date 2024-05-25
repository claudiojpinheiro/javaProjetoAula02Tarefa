package controller;

import java.util.Scanner;
import java.util.UUID;

import Repositories.ProdutoRepository;
import entities.Categoria;
import entities.Produto;

public class ProdutoController {

	public void cadastrarProduto() {

		System.out.println("\n****SISTEMA DE CADASTRO DE PRODUTO****");

		Scanner scanner = new Scanner(System.in);

		Produto produto = new Produto();
		produto.setCategoria(new Categoria());

		produto.setId(UUID.randomUUID());

		System.out.println("\nDigite o nome do produto: ");
		produto.setNome(scanner.nextLine());

		System.out.println("\nDigite a descricao do produto: ");
		produto.setDescricao(scanner.nextLine());

		System.out.println("\nDigite o preco do produto: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));

		System.out.println("\nDigite a quantidade do produto: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

		produto.getCategoria().setId(UUID.randomUUID());

		System.out.println("\nDigite o codigo da categoria do produto: ");
		produto.getCategoria().setCodigo(scanner.nextLine());

		System.out.println("\nDigite a descrição da categoria do produto: ");
		produto.getCategoria().setDescricao(scanner.nextLine());

		scanner.close();

		try {
			
			ProdutoRepository produtoRepository = new ProdutoRepository();
			produtoRepository.exportarProduto(produto);
			System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
