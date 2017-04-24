
// TODO: Auto-generated Javadoc
/**
 * The Class EmpleadoComision.
 */
public class EmpleadoComision extends Trabajador{
	
	/** The ventas. */
	double ventas;
	
	/** The comision. */
	double comision;
	
	/**
	 * Instantiates a new empleado comision.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param dni the dni
	 * @param sexo the sexo
	 * @param nss the nss
	 * @param ventas the ventas
	 * @param comision the comision
	 */
	public EmpleadoComision(String nombre, String apellido, String dni,
			Sexo sexo, String nss, double ventas, double comision) {
		super(nombre, apellido, dni, sexo, nss);
		this.ventas = ventas;
		this.comision = comision;
	}
	
	/* (non-Javadoc)
	 * @see Trabajador#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append(super.toString())
			.append(ventas).append(endLine)
			.append(comision).append(endLine);
		return sb.toString();
	}
	
	/**
	 * Gets the sueldo.
	 *
	 * @return the sueldo
	 */
	public double getSueldo() {
		return ventas*comision;
	}
	
	/**
	 * Gets the ventas.
	 *
	 * @return the ventas
	 */
	public double getVentas() {
		return ventas;
	}
	
	/**
	 * Sets the ventas.
	 *
	 * @param ventas the new ventas
	 */
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	/**
	 * Gets the porcentaje comision.
	 *
	 * @return the porcentaje comision
	 */
	public double getPorcentajeComision() {
		return comision*100;
	}
	
	/**
	 * Sets the porcentaje comision.
	 *
	 * @param comision the new porcentaje comision
	 */
	public void setPorcentajeComision(double comision) {
		this.comision = comision/100;
	}
}