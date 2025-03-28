package teste.basico;

import modelo.basico.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario:usuarios){
            System.out.println("ID: "+ usuario.getId()+ "\n"+"Nome: "+ usuario.getNome());
        }

        em.close();
        emf.close();
    }
}
