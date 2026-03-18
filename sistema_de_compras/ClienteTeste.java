package sistema_de_compras;

public class ClienteTeste {

	public static void main(String[] args) {
		
	
	Cliente c1 = new Cliente("Guilherme");
	
	Produto p1 = new Produto("Arroz", 15.75);
	Produto p2 = new Produto("Feijão", 7.89);
	
	Item i1 = new Item (p1, 4);
	Item i2 = new Item (p2, 2);
	
	Compra compra1 = new Compra();
	compra1.adicionarItem(i1);
	compra1.adicionarItem(i2);
	
	c1.adicionarCompra(compra1);
	
	
	System.out.println(c1.nomeCliente);
	System.out.println(i1.valorDoItem());
	System.out.println(i2.valorDoItem());
	System.out.println();
	System.out.println("Total: " + compra1.obterValorTotal());

	}
}
