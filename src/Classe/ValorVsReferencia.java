package Classe;


public class ValorVsReferencia {

    public static void main(String[] args) {


        double a = 2;
        double b = a; // atribução por valor

        a++;
        b--;

        System.out.println("A: "+ a + "\nB: "+ b);

        Data d1 = new Data(01,05,1970);
        Data d2 = d1;  // atribuição por Referência
        d1.ano = 1990;


        System.out.println(d1.ano);
        System.out.println(d2.ano);


    }
}
