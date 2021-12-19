package dto;

public class CompraDto {
	private int id;
	private int mondedaId;
	private String nombre;
	private int cantidad;
	private double precio;

	public CompraDto(int id, int mondedaId, String nombre, int cantidad, double precio) {
		super();
		this.id = id;
		this.mondedaId = mondedaId;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMondedaId() {
		return mondedaId;
	}

	public void setMondedaId(int mondedaId) {
		this.mondedaId = mondedaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CompraDto [id=" + id + ", mondedaId=" + mondedaId + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
	

}
