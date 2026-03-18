package sistema_de_compras;

public class Item {

	
	int quantidade;
	Produto produto; 
	
	Item(Produto produto, int quantidade){
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public double valorDoItem() {
		return (double) produto.valorProduto * quantidade;
	}	

}
