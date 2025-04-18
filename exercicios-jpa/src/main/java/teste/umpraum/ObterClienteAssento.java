package teste.umpraum;

import infra.DAO;
import modelo.basico.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        Cliente cliente = dao.obterPorId(1L);
        System.out.println(cliente.getAssento().getNome());

        dao.fechar();
    }
}
