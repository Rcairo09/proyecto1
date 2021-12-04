package views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Fucsia extends PrincipalFrame{
	
	private Panel panelFucsia;
	private static final long serialVersionUID = 6024865636813140648L;

	public Fucsia(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		Color fucsia = new Color(255, 0, 255);
		panelFucsia = new Panel();
		panelFucsia.setBounds(0,0,390,200);
		panelFucsia.setBackground(fucsia);
		add(panelFucsia);
		setSize(390,200);
		setTitle("Formulario Fucsia");
	}
}
