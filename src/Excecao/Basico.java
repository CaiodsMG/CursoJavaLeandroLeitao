package Excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try{
            imprimirAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do Usuario");
        }


        try{
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("É impossivel dividir por 0");;
        }

        System.out.println("Fim!!!");
    }

    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
