package entities;

public class OrderItem {
	
	private Integer quantidade;
	private Double preço;
	
	private Product produto;
	
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantidade, Double preço, Product produto) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return quantidade * preço;
	}
	
	public String toString() {
		return produto.getNome() 
				+ ", $" 
				+ String.format("%.2f", preço) 
				+ ", Quantidade: " 
				+ quantidade + 
				", Total: $" 
				+ String.format("%.2f", subTotal());
	}

}
