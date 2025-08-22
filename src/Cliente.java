public class Cliente {

    private static int contador = 0;
    private int id;
    private String nome;
    private String documentoIdentidade;

    public Cliente(String nome, String documentoIdentidade) {
        this.id = ++contador; //Incrementa o contador e atribui ao ID
        this.nome = nome;
        this.documentoIdentidade = documentoIdentidade;
    }
    }

