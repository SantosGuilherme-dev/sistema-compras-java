package sistema_de_compras;

import java.util.ArrayList;
import java.util.List;

public class Cliente{
	
	 String nomeCliente; 
	 List<Compra>compras = new ArrayList<>();
	
	Cliente(String nomeCliente){
		 this.nomeCliente =  nomeCliente;
	}
	
	public void adicionarCompra(Compra compra1) {
		compras.add(compra1);
	}
}