
package displays;


public class DisplayRelogio {
    
    private DisplayNumero displayHoras;
    private DisplayNumero displayMinutos;

    public DisplayRelogio() {
        this.displayHoras = new DisplayNumero(24);
        this.displayMinutos = new DisplayNumero(60);
    }
    
    public String mostraDisplay(){
        return displayHoras.getValor()+":"+
                displayMinutos.getValor();
    }
    
    public void setTime(Integer novaHora, Integer novoMinuto) {
        displayHoras.setValor(novaHora);
        displayMinutos.setValor(novoMinuto);
    }
    
    /**
     * Aumenta um minuto no relogio
     */
    public void tick(){
        displayMinutos.incrementa();
        if (displayMinutos.getValor().equals("00")){
            displayHoras.incrementa();
        }
    }
    
    
}
