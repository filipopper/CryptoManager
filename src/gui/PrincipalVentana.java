package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import dto.MonedaDto;

public class PrincipalVentana extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalVentana frame = new PrincipalVentana();
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
	public PrincipalVentana() {
		setTitle("Listar moneda");
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("moneda");
		menuBar.add(mnNewMenu);

		JMenuItem mnMoneda = new JMenuItem("agregar");
		mnMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verAgregarMonedaInternalFrame();
			}
		});
		mnNewMenu.add(mnMoneda);

		JMenuItem mntmListarmoneda = new JMenuItem("Listar moneda");
		mntmListarmoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verListaMonedas();
			}
		});
		mnNewMenu.add(mntmListarmoneda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);

		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

	public void verListaMonedas() {
		// TODO Auto-generated method stub
		ListarMonedasSubVentana ventana = new ListarMonedasSubVentana(this);
		ventana.setVisible(true);
		desktopPane.add(ventana);

	}

	public void verAgregarMonedaInternalFrame() {
		// TODO Auto-generated method stub
		AgregarMonedaSubVentana ventana = new AgregarMonedaSubVentana();
		ventana.setVisible(true);
		desktopPane.add(ventana);

	}
	public void verEditarMonedaInternalFrame(MonedaDto moneda) {
		// TODO Auto-generated method stub
		VentanaEditar ventana = new VentanaEditar(moneda);
		ventana.setVisible(true);
		desktopPane.add(ventana);

	}
}
