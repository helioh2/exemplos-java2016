
package displays;


public class DisplayNumero {
    
    private Integer valor;
    private Integer limite;

    public DisplayNumero(Integer limite) {
        this.valor = 0;
        this.limite = limite;
    }

    public String getValor() {
        return doisDigitos(valor);
    }

    private String doisDigitos(Integer valor) {
        if (valor < 10){
            return "0"+valor;
        }
        return ""+valor;
    }

    public void setValor(Integer novoValor) {
        if (novoValor < limite && novoValor >= 0){
            this.valor = novoValor;
        }
    }

    public void incrementa() {
        valor = (valor + 1) % limite;
    }
    
    
    
    
    
}
