package ca.onepoint.yul.repository.custom;

import ca.onepoint.yul.dto.AvatarDto;
import ca.onepoint.yul.entity.Avatar;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvatarRepositoryCustom {

    AvatarDto findByIdAvatar(Integer id);

    List<Avatar> findByType(Integer id);

    void createAvatar(Avatar avatar);

    void updateAvatar(AvatarDto avatarDto);
}
