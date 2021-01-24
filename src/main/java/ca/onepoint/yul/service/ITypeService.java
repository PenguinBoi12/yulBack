package ca.onepoint.yul.service;

import ca.onepoint.yul.dto.TypeDto;
import ca.onepoint.yul.entity.Type;

import java.util.List;

public interface ITypeService {

    void createType(Type type);
    List<Type> getAllTypes();

}
