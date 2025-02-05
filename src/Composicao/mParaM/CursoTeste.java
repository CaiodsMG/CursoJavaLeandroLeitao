package Composicao.mParaM;

public class CursoTeste {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Caio");
        Aluno aluno2 = new Aluno("Loren");
        Aluno aluno3 = new Aluno("Zé");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("PHP");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);



        for(Aluno aluno: curso3.alunos){
            System.out.println(aluno.nome);
        }


        System.out.println(aluno1.cursos.get(0).alunos);

    }
}
