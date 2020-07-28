package com.sena.wiguma.procesos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Procesos", schema = "proceso")
public class Proceso {
	
	@Id
	@Column(name = "id", length = 40)
	private String id;
	
	@Column(name = "caudal", length = 40)
	private Long caudal;
	
	@Column(name = "temperatura", length = 40)
	private Long temperatura;
	
	@Column(name = "humedad", length = 40)
	private Long humedad;
	
	@Column(name = "ph", length = 40)
	private Long ph;
	
	@Column(name = "s_nivel_alto", length = 40)
	private Long sNivAlto;
	
	@Column(name= "s_nivel_minimo", length = 40)
	private Long sNivMinimo;
	
	@Column(name= "s_presencia", length = 40)
	private Long sPresencia;
	
	@Column(name = "tipo_producto", length = 40)
	private String tipoProducto;
	
	@Column(name = "cantidad", length = 40)
	private Long cantidad;
	
	/**
	 * Getters and setters
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCaudal() {
		return caudal;
	}

	public void setCaudal(Long caudal) {
		this.caudal = caudal;
	}

	public Long getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Long temperatura) {
		this.temperatura = temperatura;
	}

	public Long getHumedad() {
		return humedad;
	}

	public void setHumedad(Long humedad) {
		this.humedad = humedad;
	}

	public Long getPh() {
		return ph;
	}

	public void setPh(Long ph) {
		this.ph = ph;
	}

	public Long getsNivAlto() {
		return sNivAlto;
	}

	public void setsNivAlto(Long sNivAlto) {
		this.sNivAlto = sNivAlto;
	}

	public Long getsNivMinimo() {
		return sNivMinimo;
	}

	public void setsNivMinimo(Long sNivMinimo) {
		this.sNivMinimo = sNivMinimo;
	}

	public Long getsPresencia() {
		return sPresencia;
	}

	public void setsPresencia(Long sPresencia) {
		this.sPresencia = sPresencia;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

}
