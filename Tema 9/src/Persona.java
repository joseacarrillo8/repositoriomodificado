import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona extends Object {

	/** The nombre. */
	private String nombre;
	
	/** The apellido. */
	private String apellido;
	
	/** The dni. */
	private String dni;
	
	/** The sexo. */
	private Sexo sexo;
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param dni the dni
	 * @param sexo the sexo
	 */
	public Persona(String nombre, String apellido, String dni, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append(nombre).append(endLine)
			.append(apellido).append(endLine)
			.append(dni).append(endLine)
			.append(sexo).append(endLine);
		
		return sb.toString();
	}
	
	/**
	 * Clasifica.
	 *
	 * @param personas the personas
	 */
	public static void clasifica(List<Persona> personas) {
		for(Persona persona:personas) {
			System.out.println(persona);
		}
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Gets the sexo.
	 *
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * Sets the sexo.
	 *
	 * @param sexo the new sexo
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}