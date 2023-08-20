//[5] Consultar todos os filmes até um determinado ano de lançamento

import java.util.Locale;
import java.util.Scanner;

public class ACMEFilmes {
    private Scanner entrada;        // Entrada de dados via teclado
    private Filmoteca filmoteca;    // Colecao de filmes

    // Construtor
    public ACMEFilmes() {
        entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);  // Usa entrada no padrao ingles
        filmoteca = new Filmoteca();
    }

    // Execucao da aplicacao
    public void executar() {
        int opcao = 0;
        do {
            menu();
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch(opcao) {
                case 0:
                    break;
                case 1:
                    cadastrarNovoFilme();
                    break;
                case 2:
                    consultarFilmePeloNome();
                    break;
                case 3:
                    consultarPorAno();
                    break;
                default:
                    System.out.println("Opcao invalida! Redigite!");
            }
        } while(opcao != 0);
    }

    // Mostra o menu de opcoes
    private void menu() {
        System.out.println("=====================================");
        System.out.println("Menu de opcoes: ");
        System.out.println("[0] Sair do sistema");
        System.out.println("[1] Cadastrar novo filme");
        System.out.println("[2] Consultar filme pelo nome");
        System.out.println("[3] Filtrar filmes pela data de lançamento ");
        System.out.println("=====================================");
    }

    private void cadastrarNovoFilme() {
        System.out.println("=====================================");
        System.out.println("Cadastrar um filme");
        System.out.print("Digite o nome do filme: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o ano de lancamento do filme: ");
        int ano = entrada.nextInt();
        System.out.print("Digite a bilheteria do filme: ");
        double bilheteria = entrada.nextDouble();
        Filme f = new Filme(nome, ano, bilheteria);
        if(filmoteca.cadastrarFilme(f))
            System.out.println("Filme cadastrado com sucesso.");
        else
            System.out.println("Erro: filme não cadastrado.");
    }

    private void consultarFilmePeloNome() {
        System.out.println("=====================================");
        System.out.println("Consultar um filme pelo nome");
        System.out.print("Digite o nome do filme: ");
        String nome = entrada.nextLine();
        Filme f = filmoteca.consultaPorNome(nome);
        if(f == null)
            System.out.println("Erro: filme não encontrado.");
        else {
            System.out.println("Nome do filme: " + f.getNome());
            System.out.println("Ano do lancamento do filme: " + f.getAnoLancamento());
            System.out.println("Bilheteria do filme: " + f.getBilheteria());
        }
    }

    private void consultarPorAno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de lançamento limite para a consulta dos filmes: ");
        int ano = teclado.nextInt();
        filmoteca.consultaPorAnoLancamento(ano);
    }
}
