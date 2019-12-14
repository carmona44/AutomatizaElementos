import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class InterfazGrafica extends JFrame{
	
	private Toolkit pantalla;
	private int alturaP;
	private int anchuraP;
	private Dimension tamanoP;
	private JPanel capa;
	
	InterfazGrafica(){
		pantalla = Toolkit.getDefaultToolkit();
		tamanoP = pantalla.getScreenSize();
		alturaP = tamanoP.height;
		anchuraP = tamanoP.width;
		
		capa = new JPanel();
		capa.setBackground(Color.BLACK);
		capa.setForeground(Color.WHITE);
		
		setBounds(anchuraP / 4, alturaP / 4, anchuraP / 2, alturaP / 2);
		setTitle("ZEUS - Generador XMLs");
		
		add(capa);
	}
	
}
