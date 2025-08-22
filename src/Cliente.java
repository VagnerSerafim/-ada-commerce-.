public class Cliente {
    private static int contador = 0;
    private int id;
    private String nome;
    private String documentoIdentidade;

    public Cliente(String nome, String documentoIdentidade) {
        this.id = ++contador;
        this.nome = nome;
        this.documentoIdentidade = documentoIdentidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumentoIdentidade() {
        return documentoIdentidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumentoIdentidade(String documentoIdentidade) {
        this.documentoIdentidade = documentoIdentidade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", documento='" + documentoIdentidade + '\'' +
                '}';
    }
}
