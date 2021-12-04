package views;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import misc.event.FormInterface;

public class InstanciasFrame extends Frame implements FormInterface{

	private static final long serialVersionUID = -6816861291004540296L;
	private Button boton1, boton2, boton3, boton4, boton5;
	private Frame instancia;
	
	public InstanciasFrame() {
		initComponents();
		instancia = this;
	}
	@Override
	public void initComponents() {
		setLayout(null);
		setTitle("Inicio");
		boton1 = new Button("Azul");boton1.setBounds(80,50,100,32);add(boton1);
		boton2 = new Button("Azul y Blanco");boton2.setBounds(200,50,100,32);add(boton2);
		boton3 = new Button("Verde");boton3.setBounds(80,100,100,32);add(boton3);
		boton4 = new Button("Fucsia");boton4.setBounds(200,100,100,32);add(boton4);
		boton5 = new Button("Calculadora");boton5.setBounds(140,150,100,32);add(boton5);
		
		setSize(390, 200);
		this.setResizable(false);
		
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		boton1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Blue azul = new Blue(instancia);
				azul.setVisible(true);
				azul.setResizable(false);
				
			}
		});
		boton2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				BlueWhite azulBlanco = new BlueWhite(instancia);
				azulBlanco.setVisible(true);
				azulBlanco.setResizable(false);
			}
		});
		boton3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Green verde = new Green(instancia);
				verde.setVisible(true);
				verde.setResizable(false);
			}
		});
		boton4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Fucsia panelFucsia = new Fucsia(instancia);
				panelFucsia.setVisible(true);			
				panelFucsia.setResizable(false);
			}
		});
		boton5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Calculator cal = new Calculator(instancia);
				cal.setVisible(true);
				
			}
		});
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showForm() {
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();
		
	}

}
