package teste.umpraum;

import infra.DAO;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("9F");
        Cliente cliente = new Cliente("Zé", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fechar();
    }
}
