package br.ifrs.edu.restinga.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import br.ifrs.edu.restinga.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CadastroCozinha {
    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
        TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);

        List<Cozinha> cozinhas = query.getResultList();

        return cozinhas;
    }

    public Cozinha adicionar() {
        Cozinha cozinha = new Cozinha();
        cozinha.setNome("Japonesa");
    }
}
