import static java.awt.Color.black;
import static java.awt.Color.gray;
import static java.awt.Color.red;
import static java.awt.Color.white;
public class Formularios {
    //Atributos
    //Ventana principal
    public void ventanaGeneral(){
        Ventana v1=new Ventana("Ficha de preinscripción",730,510,white,true);
        int posX=30,posY=10,tamañoX=200,tamañoY=30,sepX=230,sepY=40;
        String[] opciones1={"Masculino","Femenino"};
        String[] opciones2={"Tamaulipas","Jalisco","Yucatán","Puebla","Chihuahua","Oxaca","Querétaro","Veracruz","Sonora","Baja California"};
        String[] opciones3={"Soltero/a","Casado/a","Divorciado/a","Viudo/a"};
        String[] opciones4={"Ing. en Sistemas","Ing. en  Agronomía","Contaduría pública"};
        //JLabel
        //Encabezado
        Etiqueta lblInfo=new Etiqueta("Información general. Complete la ficha y genere su cuenta","Arial",1,posX,posY,3*tamañoX,tamañoY,red,true);
        //fila 1
        Etiqueta lblCurp=new Etiqueta("CURP","Arial",1,posX,sepY,tamañoX,tamañoY,black,true);
        //Fila 2
        Etiqueta lblNombre=new Etiqueta("Nombre","Arial",1,posX,3*sepY,tamañoX,tamañoY,black,true);
        Etiqueta lblPaterno=new Etiqueta("Paterno","Arial",1,posX+sepX,3*sepY,tamañoX,tamañoY,black,true);
        Etiqueta lblMaterno=new Etiqueta("Materno","Arial",1,posX+2*sepX,3*sepY,tamañoX,tamañoY,black,true);
        //Fila 3
        Etiqueta lblFechaDeNacimiento=new Etiqueta("Fecha de nacimiento","Arial",1,posX,5*sepY,tamañoX,tamañoY,black,true);
        Etiqueta lblSexo=new Etiqueta("Sexo","Arial",1,posX+sepX,5*sepY,tamañoX,tamañoY,black,true);
        Etiqueta lblEstadoDeNacimiento=new Etiqueta("Estado de nacimiento","Arial",1,posX+2*sepX,5*sepY,tamañoX,tamañoY,black,true);
        //Fila 4
        Etiqueta lblEstadoCivil=new Etiqueta("Estado Civil","Arial",1,posX,7*sepY,tamañoX,tamañoY,black,true);
        Etiqueta lblCarrera=new Etiqueta("Carrera a ingresar","Arial",1,posX+sepX,7*sepY,tamañoX,tamañoY,black,true);
        Etiqueta lblUsuario=new Etiqueta("Usuario","Arial",1,posX+2*sepX,7*sepY,tamañoX,tamañoY,black,true);
        //Fila 5
        Etiqueta lblContraseña=new Etiqueta("Contraseña","Arial",1,posX,9*sepY,tamañoX,tamañoY,black,true);
        //JTextField
        //Fila 1
        CuadroDeTexto txtCurp=new CuadroDeTexto(posX,2*sepY,tamañoX,tamañoY,gray,true);
        //Fila 2
        CuadroDeTexto txtNombre=new CuadroDeTexto(posX,4*sepY,tamañoX,tamañoY,gray,true);
        CuadroDeTexto txtPaterno=new CuadroDeTexto(posX+sepX,4*sepY,tamañoX,tamañoY,gray,true);
        CuadroDeTexto txtMaterno=new CuadroDeTexto(posX+2*sepX,4*sepY,tamañoX,tamañoY,gray,true);
        //Fila 3
        CuadroDeTexto txtFechaDeNacimiento=new CuadroDeTexto(posX,6*sepY,tamañoX,tamañoY,gray,true);
        //Fila 4
        CuadroDeTexto txtUsuario=new CuadroDeTexto(posX+2*sepX,8*sepY,tamañoX,tamañoY,gray,true);
        //Fila 5
        CuadroDeTexto txtContraseña=new CuadroDeTexto(posX,10*sepY,tamañoX,tamañoY,gray,true);
        //JComboBox
        //Fila 3
        ListaDespegable listaSexo=new ListaDespegable(posX+sepX,6*sepY,tamañoX,tamañoY,opciones1);
        ListaDespegable listaEstadoDeNacimiento=new ListaDespegable(posX+2*sepX,6*sepY,tamañoX,tamañoY,opciones2);
        //Fila 4
        ListaDespegable listaEstadoCivil=new ListaDespegable(posX,8*sepY,tamañoX,tamañoY,opciones3);
        ListaDespegable listaCarrera=new ListaDespegable(posX+sepX,8*sepY,tamañoX,tamañoY,opciones4);
        //JButton
        Boton bConsultarCurp=new Boton("Consultar",posX+sepX,2*sepY,100,30,gray,black,true);
        //Condición para desbloquear el botón bEnviarInformación utilizando lo que se encuentra en los cuadros de texto
        boolean interruptor,letras,numeros,caracteres;
        //Detector de cadenas con caracteres que no son letras
//        for (int i = 0; i < 10; i++) {
//            if (caracteres) {
//                
//            }
//            for (int j = 0; j < 10; j++) {
//                
//            }//casos letras
//        }
//        //Detector de cadenas con caracteres que no son enteros
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                
//            }//Casos enteros
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                
//            }//Casos de enteros con número de caracteres
//        }
//        //if con compuertas AND
//        if (letras&&numeros&&caracteres) {
//            interruptor=true;
//        }else{
//            interruptor=false;
//        }//cambiar el booleano del botón bEnviarInformación
        Boton bEnviarInformacion=new Boton("Enviar Informacion",posX+sepX,11*sepY,200,30,red,white,false);
        
        //Eventos de los botones
        //Botón de consulta
        //Botón de enviar información
        
        //
        //Agregar componetes
        //Etiquetas (12)
        v1.agregaComponentes(lblInfo);
        v1.agregaComponentes(lblCurp);
        v1.agregaComponentes(lblNombre);
        v1.agregaComponentes(lblPaterno);
        v1.agregaComponentes(lblMaterno);
        v1.agregaComponentes(lblFechaDeNacimiento);
        v1.agregaComponentes(lblSexo);
        v1.agregaComponentes(lblEstadoDeNacimiento);
        v1.agregaComponentes(lblEstadoCivil);
        v1.agregaComponentes(lblCarrera);
        v1.agregaComponentes(lblUsuario);
        v1.agregaComponentes(lblContraseña);
        //Cuadros de texto (7)
        v1.agregaComponentes(txtCurp);
        v1.agregaComponentes(txtNombre);
        v1.agregaComponentes(txtPaterno);
        v1.agregaComponentes(txtMaterno);
        v1.agregaComponentes(txtFechaDeNacimiento);
        v1.agregaComponentes(txtUsuario);
        v1.agregaComponentes(txtContraseña);
        //Listas depegables (4)
        v1.agregaComponentes(listaSexo.crearLista());
        v1.agregaComponentes(listaEstadoDeNacimiento.crearLista());
        v1.agregaComponentes(listaEstadoCivil.crearLista());
        v1.agregaComponentes(listaCarrera.crearLista());
        //Botones (2)
        v1.agregaComponentes(bConsultarCurp);
        v1.agregaComponentes(bEnviarInformacion);
    }
    //Ventana secundaria 1
    public void cuentaInstitucional(){
        Ventana v2=new Ventana("Consulta",500,300,gray,true);
    }
}