package ca.onepoint.yul.repository.custom;

import ca.onepoint.yul.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepositoryCustom {
    void createType(Type type);
    List<Type> getAllTypes();
}
