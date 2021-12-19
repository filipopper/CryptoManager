package model;

import java.util.ArrayList;

import dao.MonedaDao;
import dto.MonedaDto;

public class Moneda {
	private int id;
	private String nombre;
	private String descripcion;
	private static int idN = 8;

	public Moneda() {

	}

	public Moneda(String nombre, String descripcion) {
		super();
		this.id = idN;
		idN++;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public ArrayList<MonedaDto> listar() {
		ArrayList<MonedaDto> lista;
		MonedaDao monedaDao = new MonedaDao();
		lista = monedaDao.listar();
		return lista;
	}

	public void editar() {
		// TODO Auto-generated method stub
		MonedaDto modedaDto = this.obtenerDto();
		MonedaDao persistencia = new MonedaDao();
		persistencia.editar(modedaDto);
	}

	public MonedaDto obtenerDto() {
		MonedaDto res = new MonedaDto(this.id, this.nombre, this.descripcion);
		return res;
	}

	public void setId(int id) {
		this.id = id;
	}

}
