import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Criar clientes
        Cliente cliente1 = new Cliente("João da Silva", "123456789");
        sistema.cadastrarCliente(cliente1);

        // Criar produtos
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse Gamer", 150.00);
        sistema.cadastrarProduto(produto1);
        sistema.cadastrarProduto(produto2);

        // Criar venda
        Venda venda = new Venda(cliente1);
        ItemVenda item1 = new ItemVenda(produto1, 2, produto1.getPreco());
        ItemVenda item2 = new ItemVenda(produto2, 1, 120.00); // preço diferente do catálogo
        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        // Alterar quantidade do mouse
        venda.alterarQuantidade(produto2, 3);

        // Finalizar venda
        venda.finalizarVenda();

        // Pagar
        venda.pagar();

        // Entregar
        venda.entregar();

        sistema.registrarVenda(venda);

        // Listar tudo
        System.out.println("\n--- Clientes ---");
        sistema.listarClientes().forEach(System.out::println);

        System.out.println("\n--- Produtos ---");
        sistema.listarProdutos().forEach(System.out::println);

        System.out.println("\n--- Vendas ---");
        sistema.listarVendas().forEach(System.out::println);
    }
}
