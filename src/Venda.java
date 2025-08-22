import java.util.Date;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;


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
        if (this.status.equals("Aberto")) {
            this.itens.add(item);

        }

    }

    public void finalizarVenda() {
        if (!itens.isEmpty()) {
            this.status = "Aguardando pagamento";

        }
    }


}
