package views;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import misc.event.FormInterface;

public class PrincipalFrame extends Frame implements FormInterface {

	private static final long serialVersionUID = -3727302686790633774L;
	Frame parentFrame;
	public PrincipalFrame(Frame parentFrame) {
		this.parentFrame = parentFrame;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if(parentFrame != null) {
					parentFrame.setVisible(true);
					}
					dispose();
				}
			});
	}
	@Override
	public void initComponents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showForm() {
		if(parentFrame != null)
		   parentFrame.setVisible(false);
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();
		
		
	}

}
