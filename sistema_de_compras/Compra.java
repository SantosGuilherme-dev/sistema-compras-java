package sistema_de_compras;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	double total = 0;
	
	public void adicionarItem(Item item){
		itens.add(item);
	}
	
	double obterValorTotal() {
		for(Item i : itens) {
			System.out.println(i.produto.nomeProduto + " x " + i.quantidade);
			total += i.quantidade * i.produto.valorProduto;
		}
		 
		return total;
	}
	

}
