import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Etiqueta extends JLabel{
    public Etiqueta(String texto,String fuente,int estilo,int coordenadaX,int coordenadaY,int ancho,int alto,Color color,boolean mostrar){
        this.setText(texto);
        this.setBounds(coordenadaX, coordenadaY, ancho, alto);
        this.setForeground(color);
        this.setFont(new Font(fuente,estilo,14));
        this.setVisible(mostrar);
    }
}