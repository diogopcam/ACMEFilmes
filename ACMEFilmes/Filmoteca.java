import java.util.ArrayList;

public class Filmoteca {

    private ArrayList<Filme> filmes;

    public Filmoteca() {
        filmes = new ArrayList<Filme>(10);
    }

    // Create - Criar - Cadastrar
    public boolean cadastrarFilme(Filme f) {
        return filmes.add(f);
    }

    // Retrieve - Consultar
    // Retorna o filme com o nome indicado ou null se nao existir
    public Filme consultaPorNome(String nome) {
        for(int i=0 ; i < filmes.size() ; i++) {
            Filme aux = filmes.get(i);
            if(aux.getNome().equals(nome))
                return aux;
        }
        return null;
    }

    public void consultaPorAnoLancamento(int ano){
        for(int n = 0; n < ((filmes.size()) - 1); n++){
            Filme filme = filmes.get(n);
            if(filme.getAnoLancamento() <= ano){
                System.out.println(filme.getNome()+" - "+filme.getAnoLancamento());
        }
        }
    }
}
