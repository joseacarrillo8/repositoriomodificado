
// TODO: Auto-generated Javadoc
/**
 * The Class Trabajador.
 */
public class Trabajador extends Persona {
	
	/** The nss. */
	private String nss;

	/**
	 * Instantiates a new trabajador.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param dni the dni
	 * @param sexo the sexo
	 * @param nss the nss
	 */
	public Trabajador(String nombre, String apellido, String dni, Sexo sexo, String nss) {
		super(nombre, apellido, dni, sexo);
		this.nss = nss;
	}
	
	/* (non-Javadoc)
	 * @see Persona#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append(super.toString())
			.append(nss).append(endLine);
		return sb.toString();
	}

	/**
	 * Gets the nss.
	 *
	 * @return the nss
	 */
	public String getNss() {
		return nss;
	}

	/**
	 * Sets the nss.
	 *
	 * @param nss the new nss
	 */
	public void setNss(String nss) {
		this.nss = nss;
	}
}