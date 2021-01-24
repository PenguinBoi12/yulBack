package ca.onepoint.yul.repository;

import ca.onepoint.yul.dto.TypeDto;
import ca.onepoint.yul.entity.Type;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository {
    void createType(Type type);
}
