import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private List<Venda> vendas;

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    // Clientes
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void atualizarCliente(int id, String novoNome, String novoDoc) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                c.setNome(novoNome);
                c.setDocumentoIdentidade(novoDoc);
                break;
            }
        }
    }

    // Produtos
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                p.setNome(novoNome);
                p.setPreco(novoPreco);
                break;
            }
        }
    }

    // Vendas
    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> listarVendas() {
        return vendas;
    }
}
