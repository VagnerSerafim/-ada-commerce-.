import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private List<Venda> vendas;

    public Sistema(){
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }
    public void cadastrarCliente (Cliente cliente){
        clientes.add(cliente);

    }
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);

    }
}
