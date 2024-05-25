package Repositories;

import java.io.PrintWriter;

import entities.Produto;

public class ProdutoRepository {

	public void exportarProduto(Produto produto) throws Exception {

		PrintWriter printWriter = new PrintWriter("Produto_" + produto.getId() + ".xml");
		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
		printWriter.write("<produto>");
			printWriter.write("<id>" + produto.getId() + "</id>");
			printWriter.write("<nome>" + produto.getNome() + "</nome>");
			printWriter.write("<descricao>" + produto.getDescricao() + "</descricao>");
			printWriter.write("<preco>" + produto.getPreco() + "</preco>");
			printWriter.write("<quantidade>" + produto.getQuantidade() + "</quantidade>");

		printWriter.write("<categoria>");
			printWriter.write("<id>" + produto.getCategoria().getId() + "</id>");
			printWriter.write("<codigo>" + produto.getCategoria().getCodigo() + "</codigo>");
			printWriter.write("<descricao>" + produto.getCategoria().getDescricao() + "</descricao>");
		printWriter.write("</categoria>");

		printWriter.write("</produto>");
		printWriter.close();

	}

}
