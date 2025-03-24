package teste.basico;

import modelo.basico.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 8L);
        em.detach(usuario); // Tira o usuario do estado gerenciavel
        usuario.setUsuarioCompleto("Thiaguinho", "thiago@lanche.com.br");

        em.merge(usuario);
        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
