package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
	
	private int cargahorario;
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargahorario;
	}
	
	public Integer getCargaHoraria() {
		return cargahorario;
	}
	public void setCargahoraria(Integer cargaHoraria) {
		this.cargahorario = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargahorario=" + cargahorario + "]";
	}
	
	

}
