
package figuras;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Quadrado implements Figura {

    
    private double lado;
    private Posicao posicao;
    private String tipoFigura;

    public Quadrado(double lado, Posicao posicao) {
        this.lado = lado;
        this.posicao = posicao;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando quadrado "
                + "de lado "+lado+" e posicao "
                + "("+posicao.getX()+","+posicao.getY()+")");
        
        JPanel p1 = new JPanel();
        JFrame f1 = new JFrame();
        //f1.add(new )
        p1.add(f1);
        Rectangle rec1 = new Rectangle((int) posicao.getX(), (int) posicao.getY(), 
                (int) lado, (int) lado);
        
        
        
    }

    @Override
    public void redimensionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pintar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void darPirueta() {
        System.out.println("dando pirueta");
    }
    
}
