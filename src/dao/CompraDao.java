package dao;

import java.util.ArrayList;
import java.util.Iterator;

import dto.CompraDto;
import dto.MonedaDto;

public class CompraDao {

	public static int idCompra = 105;

	public CompraDao() {

	}

	public ArrayList<CompraDto> listar() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstancia();
		ArrayList<CompraDto> lista = singleton.listarC();
		return lista;
	}

	public int agregar(CompraDto mon) {
		// TODO Auto-generated method stub
		idCompra++;
		Singleton singleton = Singleton.getInstancia();
		mon.setId(idCompra);
		ArrayList<CompraDto> lista = singleton.listarC();
		lista.add(mon);
		return idCompra;
	}
	
	

}
