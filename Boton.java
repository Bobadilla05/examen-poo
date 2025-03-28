import java.awt.Color;
import javax.swing.JButton;

public class Boton extends JButton{
    public Boton(String texto,int coordenadaX,int coordenadaY,int ancho,int alto,Color fondo,Color cTexto,boolean escender){
        this.setLocation(coordenadaX, coordenadaY);
        this.setText(texto);
        this.setSize(ancho, alto);
        this.setBackground(fondo);
        this.setForeground(cTexto);
        this.setEnabled(escender);
    }
}