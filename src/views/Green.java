package views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Green extends PrincipalFrame{
	private Panel panelVerde;
	private static final long serialVersionUID = 3732810123503325002L;
	
	public Green(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		panelVerde = new Panel();
		panelVerde.setBounds(0,0,390,200);
		panelVerde.setBackground(Color.GREEN);
		add(panelVerde);
		setSize(390,200);
		setTitle("Formulario Verde");
	}
}
