package ca.onepoint.yul.repository;

import ca.onepoint.yul.entity.Type;
import ca.onepoint.yul.repository.custom.TypeRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long>, TypeRepositoryCustom {
    void createType(Type type);
}
