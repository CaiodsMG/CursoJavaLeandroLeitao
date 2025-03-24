package teste.heranca;

import infra.DAO;
import modelo.basico.heranca.Aluno;
import modelo.basico.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {

        DAO<Aluno> aluno = new DAO<Aluno>();

        Aluno aluno1 = new Aluno("João", 123L);
        AlunoBolsista aluno2 = new AlunoBolsista("Vinicius", 345L, 1000.0);

        aluno.incluirAtomico(aluno1);
        aluno.incluirAtomico(aluno2);

        aluno.fechar();
    }
}
