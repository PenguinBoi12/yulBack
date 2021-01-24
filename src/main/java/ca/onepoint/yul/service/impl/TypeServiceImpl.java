package ca.onepoint.yul.service.impl;

import ca.onepoint.yul.dto.TypeDto;
import ca.onepoint.yul.entity.Type;
import ca.onepoint.yul.repository.TypeRepository;
import ca.onepoint.yul.service.IAvatarService;
import ca.onepoint.yul.service.ITypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "TypeService")
public class TypeServiceImpl implements ITypeService {

    @Resource
    private TypeRepository typeRepository;

    @Override
    public void createType(Type type) {
        typeRepository.createType(type);
    }

    @Override
    public List<Type> getAllTypes() {
        return typeRepository.getAllTypes();
    }
}
