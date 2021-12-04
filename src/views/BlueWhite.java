package views; 

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class BlueWhite extends PrincipalFrame {
	private Panel panelAzul;
	private Panel panelBlanco;
	private static final long serialVersionUID = -6009419305537242596L;
	
	public BlueWhite(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		panelAzul = new Panel();
		panelBlanco = new Panel();
		panelAzul.setBounds(0,0,195,200);
		panelBlanco.setBounds(195,0,195,200);
		panelAzul.setBackground(Color.BLUE); add(panelAzul);
		panelBlanco.setBackground(Color.WHITE);add(panelBlanco);
		setSize(390,200);
		setTitle("Formulario Azul y Blanco");
		
	}

}
