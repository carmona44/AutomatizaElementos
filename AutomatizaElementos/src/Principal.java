import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
    	
    	LectorEspecificos lector = new LectorEspecificos("CT102A_datosEspecificos.xlsx");
    	
    	InterfazGrafica interfaz = new InterfazGrafica();
    	
    	interfaz.setVisible(true);
    	interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//lector.leeDatosEsp();
    	
    }
}
