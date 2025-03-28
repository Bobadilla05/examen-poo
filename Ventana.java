import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    private JPanel panel;
    public Ventana(String titulo,int ancho,int alto,Color panel,boolean mostrar){
        super(titulo);
        this.setTitle(titulo);
        this.setSize(ancho,alto);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(mostrar);
        this.crearPanel(panel);
    }
    public void crearPanel(Color color){
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(color);
        this.add(panel);
        panel.setVisible(true);
    }
    public void agregaComponentes(JComponent componente){
        panel.add(componente);
    }
}