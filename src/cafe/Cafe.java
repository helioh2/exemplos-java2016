package cafe;

public class Cafe {

	// atributos (campos)
	private String tipo;
	private Double preco;
	private Double peso;

	// construtor
	public Cafe(String tipo, Double preco, Double peso){
		this.tipo = tipo;
		this.preco = preco;
		this.peso = peso;
	}
	
	// metodos
	public String getTipo(){
		return this.tipo;
	}
	
	public Double getPreco(){
		return this.preco;
	}
	
	public Double getPeso(){
		return this.peso;
	}
	
	
	public void printCafe(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "-----Informação sobre o café:------\n"+
				"Tipo: "+ this.tipo + "\n" +
				"Preco: "+ this.preco + "\n"+
				"Peso: "+ this.peso + "\n----------------";
	}
	
	
	
}
