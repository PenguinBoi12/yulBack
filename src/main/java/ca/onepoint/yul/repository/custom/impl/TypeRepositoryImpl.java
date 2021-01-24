package ca.onepoint.yul.repository.custom.impl;

import ca.onepoint.yul.entity.Type;
import ca.onepoint.yul.repository.TypeRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TypeRepositoryImpl implements TypeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createType(Type type) {
        entityManager.getTransaction().begin();
        entityManager.persist(type);
        entityManager.getTransaction().commit();
    }
}
