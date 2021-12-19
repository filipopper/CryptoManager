package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;//

import dto.MonedaDto;
import model.Moneda;

public class VentanaEditar extends JInternalFrame {
	private JTextField textId;
	private JTextField textNombre;
	private JTextField textdescripcion;
	private MonedaDto MonedaDto;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaEditar() {
		GeneralGUI();
	}

	public VentanaEditar(MonedaDto persona) {
		// TODO Auto-generated constructor stub
		GeneralGUI();
		textId.setText(persona.getId() + "");
		textNombre.setText(persona.getNombre());
		textdescripcion.setText(persona.getDescripcion() + "");
	}

	private void GeneralGUI() {
		// TODO Auto-generated method stub
		setClosable(true);
		setTitle("Persona");
		setBounds(100, 100, 1095, 500);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(34, 37, 972, 354);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombre.setBounds(31, 115, 150, 50);
		panel.add(lblNombre);

		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textId.setBounds(209, 41, 100, 50);
		panel.add(textId);
		textId.setColumns(10);
		textId.setEditable(false);

		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textNombre.setColumns(10);
		textNombre.setBounds(213, 127, 500, 50);
		panel.add(textNombre);

		textdescripcion = new JTextField();
		textdescripcion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textdescripcion.setColumns(10);
		textdescripcion.setBounds(213, 210, 500, 50);
		panel.add(textdescripcion);

		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblId.setBounds(31, 40, 150, 50);
		panel.add(lblId);

		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDescripcion.setBounds(31, 197, 150, 50);
		panel.add(lblDescripcion);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(textId.getText());
					String Descripcion = textdescripcion.getText();
					String nombre = textNombre.getText();
					// MonedaDto MonedaDto = new MonedaDto(id, nombre, Descripcion);
					Moneda moneda = new Moneda(nombre, Descripcion);
					moneda.setId(id);
					moneda.editar();
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnModificar.setBounds(31, 288, 150, 50);
		panel.add(btnModificar);

	}
}
