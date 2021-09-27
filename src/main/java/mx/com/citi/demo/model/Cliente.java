package mx.com.citi.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaAlta;
	private Date fechaNacimiento;
	private boolean status;
	private Estado estado;
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente() {
	}

	@Override
	public String toString() {
		return "ClienteDTO [id=" + id + ", nombre=" + nombre + ", ape_pat=" + apellidoPaterno + ", ape_mat="
				+ apellidoMaterno + ", fecha_nacimiento=" + fechaNacimiento + ", fecha_alta=" + fechaAlta + ", estatus="
				+ status + ", estado_id=" + estado.getId() + "]";
	}
}
