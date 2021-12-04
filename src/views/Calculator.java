package views;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator extends PrincipalFrame {
	private static final long serialVersionUID = 236953763033352579L;
	private Label l1,l2,l3;
	private TextField t1,t2,t3;
	private Checkbox c1,c2,c3,c4;
	private CheckboxGroup check1;
	private Button b1,b2;
	
	
	public Calculator(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		
		b1 = new Button("Calcular");b1.setBounds(20, 175, 100, 32);add(b1);
		b2 = new Button("Borrar");b2.setBounds(370, 175, 100, 32);add(b2);
		l1 = new Label("1er numero");l1.setBounds(20,50,100,32);add(l1);
		l2 = new Label("2do numero");l2.setBounds(20,84,100,32);add(l2);
		l3 = new Label("Resultado");l3.setBounds(20,118,100,32);add(l3);
		t1 = new TextField();t1.setBounds(122,50,250,30);add(t1);
		t2 = new TextField();t2.setBounds(122,84,250,30);add(t2);
		t3 = new TextField();t3.setBounds(122,118,250,30);add(t3);
		check1 = new CheckboxGroup();
		c1 = new Checkbox("Suma", check1, false);c1.setBounds(380, 50,100, 24);add(c1);
		c2 = new Checkbox("Resta", check1, false);c2.setBounds(380, 75, 100, 24);add(c2);
		c3= new Checkbox("Multiplicación", check1, false);c3.setBounds(380, 100, 100, 24);add(c3);
		c4 = new Checkbox("División", check1, false);c4.setBounds(380, 125,100,24);add(c4);
		
		c1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				b1.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent a) {
						String text1 = t1.getText();
						String text2 = t2.getText();
						double n1 = Double.parseDouble(text1);
						double n2 = Double.parseDouble(text2);
						double result = n1+n2;
						String resultado = String.valueOf(result);
						t3.setText(resultado);
					}
				});
			}
		});
		
		c2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				b1.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent a) {
						String text1 = t1.getText();
						String text2 = t2.getText();
						double n1 = Double.parseDouble(text1);
						double n2 = Double.parseDouble(text2);
						double result = n1-n2;
						String resultado = String.valueOf(result);
						t3.setText(resultado);
					}
				});
			}
		});
		
		c3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				b1.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent a) {
						String text1 = t1.getText();
						String text2 = t2.getText();
						double n1 = Double.parseDouble(text1);
						double n2 = Double.parseDouble(text2);
						double result = n1*n2;
						String resultado = String.valueOf(result);
						t3.setText(resultado);
					}
				});
			}
		});
		
		c4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				b1.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent a) {
						String text1 = t1.getText();
						String text2 = t2.getText();
						double n1 = Double.parseDouble(text1);
						double n2 = Double.parseDouble(text2);
						double result = n1/n2;
						String resultado = String.valueOf(result);
						t3.setText(resultado);
					}
				});
			}
		});
		b2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		
		setTitle("Mini Calculadora");
		setSize(500, 250);	
		
		
	}	

}
