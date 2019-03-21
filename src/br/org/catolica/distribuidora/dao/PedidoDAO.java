package br.org.catolica.distribuidora.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.org.catolica.distribuidora.model.Pedido;


public class PedidoDAO {
	private static List<Pedido> Pedidos = 
			new ArrayList<Pedido>();

	static{
		Pedido pedido = new Pedido();
		pedido.setId(10);
		pedido.setQuantidade(5);
		pedido.setValorTotal(50);
		pedido.setValorUnidade(10);	
		Pedidos.add(pedido);
		
		Pedido pedido2 = new Pedido();
		pedido2.setId(11);
		pedido2.setQuantidade(5);
		pedido2.setValorTotal(50);
		pedido2.setValorUnidade(10);	
		Pedidos.add(pedido2);
	}
	
	public static List<Pedido>ObterPedidos(){
		return Pedidos;
	}

	public static void CriarPedido(Pedido pedido) {
		Pedidos.add(pedido);
		
	}
}
