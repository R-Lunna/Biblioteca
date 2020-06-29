package application;

import java.util.Scanner;

import entities.Livro;

public class Biblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux;
		String titulo;
		String autores;
		String editora;
		
		Livro obj = new Livro();
		
		do {
			System.out.println("Deseja cadastrar um novo livro?");
			aux = sc.nextLine();
			
			if (aux.contains("sim")) {
				System.out.print("Informe o título do livro: ");
				titulo = sc.nextLine();
			
				System.out.println();
				System.out.print("Informe o autor: ");
				autores = sc.nextLine();
			
				System.out.println();
				System.out.print("Informe a editora: ");
				editora = sc.nextLine();
			
				obj.addLivro(obj, titulo, autores, editora);
			}
		} while (aux.contains("sim"));
		
		do {
			
			System.out.println("Deseja remover um livro da biblioteca: ");
			aux = sc.nextLine();
			
			if(aux.contains("sim")) {
				System.out.println("Informe o título do livro a ser removido: ");
				titulo = sc.nextLine();
				obj.removeLivro(titulo);
			}
			
			System.out.println("Deseja repetir a operação?");
			aux = sc.nextLine();
		} while (aux.contains("sim"));
		
		do {
			
			System.out.println("Deseja visualizar um livro específico ou a lista completa?");
			aux = sc.nextLine();
			
			if (aux.contains("lista completa")) {
				obj.allLivro();
			} else {
				System.out.println("Informe o título do livro: ");
				titulo = sc.nextLine();
				obj.retornaLivro(titulo);
			}
			
			System.out.println("Deseja visualizar a quantidade de livros na biblioteca: ");
			aux = sc.nextLine();
			
			if (aux.contains("sim")) {
				obj.qtdLivro();
			}
			System.out.println("Deseja repetir a operação: ");
			aux = sc.nextLine();
			
		} while (aux.contains("sim"));
		
		sc.close();

	}

}
