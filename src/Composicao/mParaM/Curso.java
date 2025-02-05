package Composicao.mParaM;

import java.util.ArrayList;

public class Curso {

    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    Curso(String nome){
        this.nome = nome;
    }
}
