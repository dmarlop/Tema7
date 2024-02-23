package diapositiva5;

public class Persona {
	private String nombre;
	private int edad;
	private double estatura;

	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + ", estatura=" + this.estatura + "]";
	}

	public boolean equals(Object obj) {
		Persona otra = (Persona) obj;

		boolean result = false;

		if (this.nombre.equals(otra.nombre) && this.edad == otra.edad && this.estatura == otra.estatura) {
			result = true;
		}
		return result;
	}
	
	
}
