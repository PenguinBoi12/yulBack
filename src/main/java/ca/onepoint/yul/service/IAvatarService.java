package ca.onepoint.yul.service;

import ca.onepoint.yul.dto.AvatarDto;
import ca.onepoint.yul.entity.Avatar;

import java.util.List;

public interface IAvatarService {

    AvatarDto getAvatarById(Integer id);

    List<AvatarDto> getAllAvatars();

    List<AvatarDto> getAvatarsByType(Integer type);

    void createAvatar(Avatar avatar);
}
