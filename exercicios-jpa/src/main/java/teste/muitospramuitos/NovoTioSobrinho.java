package teste.muitospramuitos;

import infra.DAO;
import modelo.basico.muitospramuitos.Sobrinho;
import modelo.basico.muitospramuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {

        Tio tio = new Tio("Caio");
        Tio tia = new Tio("Loren");

        Sobrinho sobrinho = new Sobrinho("Davi");
        Sobrinho sobrinha = new Sobrinho("Fernanda");

        tia.getSobrinhos().add(sobrinho);
        sobrinho.getTios().add(tia);

        tia.getSobrinhos().add(sobrinha);
        sobrinha.getTios().add(tia);

        tio.getSobrinhos().add(sobrinho);
        sobrinho.getTios().add(tio);

        tio.getSobrinhos().add(sobrinho);
        sobrinha.getTios().add(tio);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .incluir(tio)
                .incluir(tia)
                .incluir(sobrinho)
                .incluir(sobrinha)
                .fecharTransacao()
                .fechar();
    }
}
