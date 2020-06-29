package entities;

import java.util.ArrayList;

public class Livro {
	private String titulo;
	private String autores;
	private String editora;
	
    private ArrayList<Livro> livro;
    private Livro x;
	
    public Livro() {
        livro = new ArrayList<Livro>();
    }

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutores() {
		return autores;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
    public ArrayList<Livro> getLivro() {
        return livro;
    }
	
    
    public void addLivro(Livro n, String titulo, String autores, String editora) {
        this.x = n;
        this.x = new Livro();
        x.setTitulo(titulo);
        x.setAutores(autores);
        x.setEditora(editora);
        livro.add(x);
    }
    
    public void removeLivro(String titulo) {
        int i = 0;
        while (i < livro.size()) {
            Livro obj = this.livro.get(i);
            if (obj.getTitulo().equals(titulo)) {
                livro.remove(i);
            }
            i++;
        }
    }
    
    public int retornaLivro(String titulo) {
        int i = 0;
        while (i < livro.size()) {
            Livro obj = this.livro.get(i);
            if (obj.getTitulo().equals(titulo)) {
                System.out.println("Título: " + livro.get(i).getTitulo());
                System.out.println("Autores: " + livro.get(i).getAutores());
                System.out.println("Editora: " + livro.get(i).getEditora());
                return 1;
            }
            i++;
        }
        
        System.out.println("Erro: Livro não encontrado");
        return 0;
    }
    
    public void allLivro() {
        int i = 0;
        while (i < livro.size()) {  
            System.out.println("Título: " + livro.get(i).getTitulo());
            System.out.println("Autores: " + livro.get(i).getAutores());
            System.out.println("Editora: " + livro.get(i).getEditora());
            i++;
        } 
    }
    
    public void qtdLivro() {
        System.out.println("Quantidade de livros: " + livro.size());
    }
}
