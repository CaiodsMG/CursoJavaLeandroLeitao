package infra;

import modelo.basico.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO(){
        super(Produto.class);
    }
}
