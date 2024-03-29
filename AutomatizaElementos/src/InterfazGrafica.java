import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class InterfazGrafica extends JFrame{
	
	private Toolkit pantalla;
	private int alturaP;
	private int anchuraP;
	private Dimension tamanoP;
	private JPanel capa;
	private JLabel label1, label2, label3, label4;
	private ButtonGroup tipoPersona;
	private JRadioButton personaFisica, personaJuridica, personaMixta;
	private JTextField codigo, ano, rutaFichero;
	private JFileChooser fc;
	private JButton examinar, generar;
	
	InterfazGrafica(){
		pantalla = Toolkit.getDefaultToolkit();
		tamanoP = pantalla.getScreenSize();
		alturaP = tamanoP.height;
		anchuraP = tamanoP.width;
		
		capa = new JPanel();
		//capa.setBackground(Color.BLACK);
		//capa.setForeground(Color.WHITE);
		
		//Tipo de persona solicitante
		label1 = new JLabel("- Tipo de persona solicitante");
		label1.setBounds(100,50,200,30); 
		tipoPersona = new ButtonGroup();
		personaFisica = new JRadioButton("Física");
		personaFisica.setBounds(100,85,100,30);
		personaJuridica = new JRadioButton("Jurídica");
		personaJuridica.setBounds(200,85,100,30);
		personaMixta = new JRadioButton("Mixta");
		personaMixta.setBounds(300,85,100,30);
		tipoPersona.add(personaFisica);
		tipoPersona.add(personaJuridica);
		tipoPersona.add(personaMixta);
		
		//Código del procedimiento
		label2 = new JLabel("- Código del procedimiento");
		codigo = new JTextField(20);
		label2.setBounds(100,150,200,25);
		codigo.setBounds(305,150,150,25);
		
		//Año de convocatoria
		label3 = new JLabel("- Año de convocatoria");
		ano = new JTextField(20);
		label3.setBounds(100,200,200,25);
		ano.setBounds(305,200,150,25);
		
		//Selección fichero
		label4 = new JLabel("Selecciona la hoja excel donde se encuentran los datos específicos:");
		rutaFichero = new JTextField(50);
		examinar = new JButton("Examinar");
		label4.setBounds(100,275,500,25);
		rutaFichero.setBounds(100,300,500,25);
		examinar.setBounds(610,300,100,25);
		
		//Botón de generar XMLs
		generar = new JButton("Generar XMLs");
		generar.setBounds(300,350,150,30);
		
		
		//Características y añadido de componentes a la capa
		setBounds(anchuraP / 4, alturaP / 4, anchuraP / 2, alturaP / 2);
		setTitle("ZEUS - Generador XMLs");
		
		capa.add(label1);
		capa.add(personaFisica);
		capa.add(personaJuridica);
		capa.add(personaMixta);
		capa.add(label2);
		capa.add(codigo);
		capa.add(label3);
		capa.add(ano);
		capa.add(label4);
		capa.add(rutaFichero);
		capa.add(examinar);
		capa.add(generar);
		
		capa.setLayout(null);
		add(capa);
		
		//Acciones a realizar por los dos botones
		examinar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	fc = new JFileChooser("./");
            	FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.xlsx", "xlsx");
            	fc.setFileFilter(filtro);
            	int seleccion = fc.showOpenDialog(capa);
            	
            	if(seleccion == JFileChooser.APPROVE_OPTION){
            		File fichero = fc.getSelectedFile();
            		rutaFichero.setText(fichero.getAbsolutePath());
            	}
            }
        });
		
		generar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	if(!rutaFichero.getText().equals("") && !ano.getText().equals("") && !codigo.getText().equals("") && tipoPersona.getSelection() != null){
            		String persona = "";
            		if(personaFisica.isSelected()){
            			persona = personaFisica.getText();
            		} else if(personaJuridica.isSelected()){
            			persona = personaJuridica.getText();
            		} else {
            			persona = personaMixta.getText();
            		}
            		LectorEspecificos lector = new LectorEspecificos(rutaFichero.getText(), codigo.getText(), ano.getText(), persona);
            		lector.leeDatosEsp(capa);
            	} else {
            		JOptionPane.showMessageDialog(capa, "No se han introducido todos los datos necesarios", "ERROR", JOptionPane.ERROR_MESSAGE);
            	}
            }
        });
	}
	
}
