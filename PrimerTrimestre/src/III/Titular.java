package III;

public class Titular {

	private String dniTitularString, nombreTitularString, apellidosTitularString;
	private int telefonoTitular;

	public String getDniTitularString() {
		return dniTitularString;
	}

	public void setDniTitularString(String dniTitularString) {
		this.dniTitularString = dniTitularString;
	}

	public String getNombreTitularString() {
		return nombreTitularString;
	}

	public void setNombreTitularString(String nombreTitularString) {
		this.nombreTitularString = nombreTitularString;
	}

	public String getApellidosTitularString() {
		return apellidosTitularString;
	}

	public void setApellidosTitularString(String apellidosTitularString) {
		this.apellidosTitularString = apellidosTitularString;
	}

	public int getTelefonoTitular() {
		return telefonoTitular;
	}

	public void setTelefonoTitular(int telefonoTitular) {
		this.telefonoTitular = telefonoTitular;
	}

	public Titular(String dniTitularString, String nombreTitularString, String apellidosTitularString,
			int telefonoTitular) {
		super();
		this.dniTitularString = dniTitularString;
		this.nombreTitularString = nombreTitularString;
		this.apellidosTitularString = apellidosTitularString;
		this.telefonoTitular = telefonoTitular;
	}

	

}
