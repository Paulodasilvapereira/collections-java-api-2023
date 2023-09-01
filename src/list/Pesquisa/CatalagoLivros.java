package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!this.livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if (!this.livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalagoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2020, 2021));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
    }
}

