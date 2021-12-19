package dao;

import java.util.ArrayList;

import dto.CompraDto;
import dto.MonedaDto;

public class Singleton {
	public static Singleton instancia = null;
	// private static Singleton instancia2 = null;
	private ArrayList<MonedaDto> listaM;
	private ArrayList<CompraDto> listaC;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
			instancia.listaM = new ArrayList<MonedaDto>() {
				{
					add(new MonedaDto(1, "BTC", "Bitcoin"));
					add(new MonedaDto(2, "ETH", "Ethereum"));
					add(new MonedaDto(3, "ADA", "Cardano"));
				}
			};
			instancia.listaC = new ArrayList<CompraDto>() {
				{
					add(new CompraDto(1, 1, "BTC", 25, 1000.00));
					add(new CompraDto(1, 1, "BTC", 25, 2000.00));

				}
			};
		}
		return instancia;
	}

	public ArrayList<MonedaDto> listarM() {
		return listaM;
	}

	public ArrayList<CompraDto> listarC() {
		return listaC;
	}

}
