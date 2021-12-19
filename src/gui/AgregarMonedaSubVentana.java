package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AgregarMonedaSubVentana extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarMonedaSubVentana frame = new AgregarMonedaSubVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgregarMonedaSubVentana() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
