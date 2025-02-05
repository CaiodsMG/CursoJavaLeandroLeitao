package Classe;

public class EqualsEHashcode {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Caio Magalhães";
        u1.email = "Caiocfn10@gmail.com";

        Usuario u2 = new Usuario();
        u1.nome = "Caio Magalhães";
        u1.email = "Caiocfn10@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));





    }
}
