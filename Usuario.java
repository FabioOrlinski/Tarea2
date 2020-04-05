public class Usuario {
	private String nombre;
	private String cedula;
	private String contraseña;
	private int edad;
	private int cantHijos;
	private int saldo;

	//Getters y setters

	public void setNombre(String unNombre) {
		nombre = unNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCedula(String unaCedula) {
		cedula = unaCedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setContraseña(String unaContraseña) {
		contraseña = unaContraseña;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setEdad(int unaEdad) {
		edad = unaEdad;
	}

	public int getEdad() {
		return edad;
	}

	public void setCantHijos(int unaCantHijos) {
		cantHijos = unaCantHijos;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setSaldo(int unSaldo) {
		saldo = unSaldo;
	}

	public int getSaldo() {
		return saldo;
	}

	//Constructores

	public Usuario() {
		this.setSaldo(0);
	}

	public Usuario(Sting unNombre, String unaCedula, String unaContraseña, int unaEdad, int unaCantHijos, int unSaldo) {
		this.setNombre(unNombre);
		this.setCedula(unaCedula);
		this.setContraseña(unaContraseña);
		this.setEdad(unaEdad);
		this.setCantHijos(unaCantHijos);
		this.setSaldo(unSaldo);
	}
}