import javax.swing.JComboBox;

public class ListaDespegable extends JComboBox{
    private int coordenadaX,coordenadaY, ancho, alto;
    private String[]opciones;
    public ListaDespegable(int coordenadaX,int coordenadaY,int ancho,int alto,String[]opciones){
        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;
        this.ancho=ancho;
        this.alto=alto;
        this.opciones=opciones;
    }
    public JComboBox<String> crearLista(){
        JComboBox<String>lista=new JComboBox<>(opciones);
        lista.setBounds(coordenadaX, coordenadaY, ancho, alto);
        return lista;
    }
}