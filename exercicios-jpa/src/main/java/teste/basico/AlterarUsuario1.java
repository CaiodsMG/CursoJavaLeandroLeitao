package teste.basico;

import modelo.basico.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 8L);
        usuario.setUsuarioCompleto("Thiago", "thiago@lanche.com.br");

        em.merge(usuario);
        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
