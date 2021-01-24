package ca.onepoint.yul.repository.custom.impl;

import ca.onepoint.yul.entity.Avatar;
import ca.onepoint.yul.entity.Type;
import ca.onepoint.yul.repository.custom.TypeRepositoryCustom;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class TypeRepositoryImpl implements TypeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void createType(Type type) {
        entityManager.createNativeQuery("INSERT INTO type (name) VALUES (?)")
                .setParameter(1, type.getName())
                .executeUpdate();
    }

    @Transactional
    @Override
    public List<Type> getAllTypes() {
        // Construction de la requête
        StringBuilder queryBuilder = new StringBuilder();
        // Clause SELECT
        queryBuilder.append("SELECT * ");
        // Clause FROM
        queryBuilder.append("FROM Type ");

        Query query = entityManager.createNativeQuery(queryBuilder.toString(), Type.class);
        return query.getResultList();
    }

}
