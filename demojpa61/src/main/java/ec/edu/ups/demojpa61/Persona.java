package ec.edu.ups.demojpa61;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	private String perCedula;
	private String perNombre;
	private int perAnioNacimiento;
	
	public String getPerCedula() {
		return perCedula;
	}
	public void setPerCedula(String perCedula) {
		this.perCedula = perCedula;
	}
	public String getPerNombre() {
		return perNombre;
	}
	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}
	public int getPerAnioNacimiento() {
		return perAnioNacimiento;
	}
	public void setPerAnioNacimiento(int perAnioNacimiento) {
		this.perAnioNacimiento = perAnioNacimiento;
	}
	
	

}
