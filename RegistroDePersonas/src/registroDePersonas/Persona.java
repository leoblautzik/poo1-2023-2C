package registroDePersonas;

public class Persona implements Comparable<Persona> {
	private Integer dni;
	private String apellido;
	private Integer edad;
	
	public Persona(Integer dni, String apellido, Integer edad) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return dni + "," + apellido + "," + edad;
	}

	@Override
	public int compareTo(Persona o) {
		return this.apellido.compareTo(o.getApellido());
	}
	
	
	
	
	
	

}
