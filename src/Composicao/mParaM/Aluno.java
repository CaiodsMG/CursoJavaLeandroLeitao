package Composicao.mParaM;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<Curso>();


    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Aluno(String nome){
        this.nome = nome;
    }


    public String toString(){
        return nome;
    }



    }

