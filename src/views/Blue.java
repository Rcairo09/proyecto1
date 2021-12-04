package views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Blue extends PrincipalFrame{
	private static final long serialVersionUID = 6826856926986974850L;
	private Panel panelAzul;
	public Blue(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		panelAzul = new Panel();
		panelAzul.setBounds(0,0,390,200);
		panelAzul.setBackground(Color.BLUE);
		add(panelAzul);
		setSize(390,200);
		setTitle("Formulario Azul");
	}	
}

