package cafe;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Hello world");
		
		Cafe cafe1 = new Cafe("Sul de Minas", 20.0, 50.0);
		Cafe cafe2 = new Cafe("Blend Classico", 35.0, 200.0);
		Cafe cafe3 = new Cafe("Norte do Paraná", 30.0, 400.0);
		
		System.out.println(cafe1.getTipo());
		System.out.println(cafe1.getPreco());
		System.out.println(cafe1.getPeso());
		
		cafe1.printCafe();
		
		System.out.println(cafe2.getTipo());
		
		System.out.println(cafe3);
		
		
		String res = String.valueOf(1 + 2 + 3);
		
		
	}
	
}
