package dao;

import java.util.ArrayList;
import java.util.Iterator;

import dto.MonedaDto;

public class MonedaDao {

	public static int idMoneda = 105;

	public MonedaDao() {

	}

	public ArrayList<MonedaDto> listar() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstancia();
		ArrayList<MonedaDto> lista = singleton.listarM();
		return lista;
	}

	public int agregar(MonedaDto mon) {
		// TODO Auto-generated method stub
		idMoneda++;
		Singleton singleton = Singleton.getInstancia();
		mon.setId(idMoneda);
		ArrayList<MonedaDto> lista = singleton.listarM();
		lista.add(mon);
		return idMoneda;
	}

	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		boolean res = false;
		Singleton singleton = Singleton.getInstancia();
		ArrayList<MonedaDto> lista = singleton.listarM();
		Iterator<MonedaDto> iterator = lista.iterator();
		while (iterator.hasNext()) {
			MonedaDto elem = iterator.next();
			if (elem.getId() == id) {
				iterator.remove();
				res = true;
			}
		}
		return res;
	}

	public boolean editar(MonedaDto mon) {
		// TODO Auto-generated method stub
		// boolean res = false;
		Singleton singleton = Singleton.getInstancia();
		ArrayList<MonedaDto> lista = singleton.listarM();
		boolean encontrado = false;
		int i = 0;
		int pos = i;
		while (!encontrado && i < lista.size()) {
			MonedaDto elemento = lista.get(i);
			if (elemento.getId() == mon.getId()) {
				encontrado = true;
				pos = i;
			}
			i++;
		}
		if (encontrado) {
			lista.get(pos).setDescripcion(mon.getDescripcion());
			lista.get(pos).setNombre(mon.getNombre());
		}
		return encontrado;
	}

}
