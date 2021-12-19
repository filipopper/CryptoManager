package gui;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JTable;

import dto.MonedaDto;
import model.Moneda;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class ListarMonedasSubVentana extends JInternalFrame implements MouseListener {
	private JTable table;
	private JScrollPane scrollPane;
	private ArrayList<MonedaDto> lista;
	private PrincipalVentana vp;
	private int filaSel;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ListarMonedasSubVentana(PrincipalVentana vp) {
		this.vp = vp;
		this.filaSel = -1;
		setTitle("Listar moneda");
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		setBounds(10, 0, 1200, 600);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 800, 400);
		getContentPane().add(scrollPane);

		JButton btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verFormularioEditar();

			}
		});
		btnEditar.setBounds(65, 464, 89, 23);
		getContentPane().add(btnEditar);
		cargarListaCriptomonedas();

	}

	public void verFormularioEditar() {
		// TODO Auto-generated method stub

		if (this.filaSel >= 0) {
			MonedaDto monedaDto = lista.get(filaSel);
			this.vp.verEditarMonedaInternalFrame(monedaDto);
		}
	}

	public void cargarListaCriptomonedas() {
		// TODO Auto-generated method stub

		Moneda moneda = new Moneda();
		lista = moneda.listar();

		// String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" },
		// { "101", "Sachin", "700000" } };
		String data[][] = obtenerMatrizDatos();
		String column[] = { "ID", "NAME", "SALARY" };
		table = new JTable(data, column);
		scrollPane.setViewportView(table);

		table.setRowSelectionAllowed(true);
		// falto agregar que la tabla escuche los eventos
		table.addMouseListener(this);

	}

	private String[][] obtenerMatrizDatos() {
		// TODO Auto-generated method stub

		String matriz[][] = new String[lista.size()][3];
		for (int i = 0; i < lista.size(); i++) {
			MonedaDto moneda = lista.get(i);
			matriz[i][0] = moneda.getNombre() + "";
			matriz[i][1] = moneda.getId() + "";
			matriz[i][2] = moneda.getDescripcion() + "";

		}

		return matriz;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.filaSel = table.rowAtPoint(e.getPoint());
		int filaAux = table.getSelectedRow();
		// int columnaAux = tablaCLientes.getSelectedColumn();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
