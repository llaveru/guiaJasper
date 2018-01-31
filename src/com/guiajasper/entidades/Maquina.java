package com.guiajasper.entidades;

public class Maquina {

	String marca;
	String modelo;
	String color;
	int potencia;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Maquina [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}
	
	
	
	
	
}
