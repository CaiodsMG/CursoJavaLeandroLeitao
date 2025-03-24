package teste.umpramuitos;

import infra.DAO;
import modelo.basico.umpramuitos.ItemPedido;
import modelo.basico.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorId(1L);

        for(ItemPedido item: pedido.getItens()){
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

        dao.fechar();
    }
}
