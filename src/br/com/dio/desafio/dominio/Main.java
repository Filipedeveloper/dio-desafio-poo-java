package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargahoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java Script");
		curso2.setDescricao("Descrição do curso JavaScript");
		curso2.setCargahoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bottcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devFilipe = new Dev();
		devFilipe.setNome("Filipe");
		devFilipe.inscreverBootcamp(bootcamp);
		devFilipe.progredit();
		devFilipe.progredit();
		devFilipe.progredit();
		System.out.println("-");
		
		System.out.println("Conteudos inscritos " + devFilipe.getConteudosInscritos());
		System.out.println("Conteudos inscritos " + devFilipe.getConteudosConcluidos());
		System.out.println("XP: " + devFilipe.calcularTotalXp());
		System.out.println("-------------------------");
		
		
		
		Dev joao = new Dev();
		joao.setNome("João");
		joao.inscreverBootcamp(bootcamp);
		joao.progredit();
		System.out.println("-");
		System.out.println("Conteudos inscritos " + joao.getConteudosInscritos());
		System.out.println("Conteudos inscritos " + joao.getConteudosInscritos());
		System.out.println("XP: " + joao.calcularTotalXp());
		System.out.println("-------------------------");

	}

}
