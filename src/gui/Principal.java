
package gui;

import java.util.ArrayList;

import dao.CompraDao;
import dao.MonedaDao;
import dto.CompraDto;
import dto.MonedaDto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toda la logica
		MonedaDao monedaDao = new MonedaDao();
		ArrayList<MonedaDto> lista = monedaDao.listar();
		for (MonedaDto moneda : lista) {
			System.out.println(moneda.toString());
		}

		CompraDao compraDao = new CompraDao();
		ArrayList<CompraDto> lista02 = compraDao.listar();
		for (CompraDto moneda : lista02) {
			System.out.println(moneda.toString());
		}

	}

}
