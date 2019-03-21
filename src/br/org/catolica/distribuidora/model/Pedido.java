package br.org.catolica.distribuidora.model;

import java.util.List;

public class Pedido {
		private int id;
		private int quantidade;
		private double valorTotal;
		private double valorTotalDoPedido;
		private double valorUnidade;
		
		public Pedido() {
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

		public List<Produto> getProduto() {
			return produtos;
		}

		public void setItens(List<Produto> produtos) {
			this.produtos = produtos;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public double getValorTotalDoPedido() {
			return valorTotalDoPedido;
		}

		public void setValorTotalDoPedido(double valorTotalDoPedido) {
			this.valorTotalDoPedido = valorTotalDoPedido;
		}

		public double getValorUnidade() {
			return valorUnidade;
		}

		public void setValorUnidade(double valorUnidade) {
			this.valorUnidade = valorUnidade;
		}

		private List<Produto> produtos;
		
		public Pedido(int id, double valorTotal) {
			this.id = id;
			this.valorTotal = valorTotal;
		}

}
