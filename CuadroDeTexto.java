import java.awt.Color;
import javax.swing.JTextField;

public class CuadroDeTexto extends JTextField{
    public CuadroDeTexto(int coordenadaX,int coordenadaY,int ancho,int alto,Color color,boolean escender){
        this.setBounds(coordenadaX, coordenadaY, ancho, alto);
        this.setForeground(color);
        this.setEnabled(escender);
    }
}