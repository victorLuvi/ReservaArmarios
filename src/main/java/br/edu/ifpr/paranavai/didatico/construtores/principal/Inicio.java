package br.edu.ifpr.paranavai.construtores.principal;

import java.util.Scanner;

import br.edu.ifpr.paranavai.construtores.diagrama.Curso;
import br.edu.ifpr.paranavai.construtores.diagrama.Estudante;

public class Inicio {

	public static void main(String[] args) {		
		//instancia��o
		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante("Jo�o");
		System.out.println("Voc� digitou: " + estudante.getNomeCompleto());
		System.out.println("Voc� digitou: " + estudante2.getNomeCompleto());
		Curso curso = new Curso();
		
	}

}
