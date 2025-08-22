import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private static int contador = 0;

    private int id;
    private Cliente cliente;
    private List<ItemVenda> itens;
    private Date dataCriacao;
    private String status;

    public Venda(Cliente cliente) {
        this.id = ++contador;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.dataCriacao = new Date();
        this.status = "Aberto";
    }

    public void adicionarItem(ItemVenda item) {
        if (status.equals("Aberto")) {
            itens.add(item);
        }
    }

    public void removerItem(Produto produto) {
        if (status.equals("Aberto")) {
            itens.removeIf(item -> item.getProduto().equals(produto));
        }
    }

    public void alterarQuantidade(Produto produto, int novaQuantidade) {
        if (status.equals("Aberto")) {
            for (ItemVenda item : itens) {
                if (item.getProduto().equals(produto)) {
                    item.setQuantidade(novaQuantidade);
                    break;
                }
            }
        }
    }

    public void finalizarVenda() {
        if (!itens.isEmpty()) {
            this.status = "Aguardando pagamento";
            System.out.println("E-mail enviado: pedido aguardando pagamento para cliente " + cliente.getNome());
        }
    }

    public void pagar() {
        if (status.equals("Aguardando pagamento")) {
            this.status = "Pago";
            System.out.println("E-mail enviado: pagamento confirmado para cliente " + cliente.getNome());
        }
    }

    public void entregar() {
        if (status.equals("Pago")) {
            this.status = "Finalizado";
            System.out.println("E-mail enviado: pedido entregue ao cliente " + cliente.getNome());
        }
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() +
                ", itens=" + itens +
                ", data=" + dataCriacao +
                ", status='" + status + '\'' +
                '}';
    }
}
