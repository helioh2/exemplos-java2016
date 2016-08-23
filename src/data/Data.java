package data;

public class Data {
	
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Data(Integer dia, Integer mes, Integer ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	public String getDataFormatada(){
		return toDoisDigitos(this.dia) + 
				"/" + toDoisDigitos(this.mes) +
				"/" + this.ano;
	}


	private String toDoisDigitos(Integer n) {
		if (n < 10 && n > 0){
			return "0" + n;
		}
		return n+"";
	}

}
