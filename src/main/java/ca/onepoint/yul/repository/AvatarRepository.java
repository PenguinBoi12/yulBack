package ca.onepoint.yul.repository;

import ca.onepoint.yul.dto.AvatarDto;
import ca.onepoint.yul.entity.Avatar;
import ca.onepoint.yul.repository.custom.AvatarRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepository extends CrudRepository<Avatar, Long>, AvatarRepositoryCustom {

    // @Query("FROM Author WHERE firstName = ?1")
    // @Query(value = "SELECT * FROM author WHERE first_name = :firstName", nativeQuery = true)
    Avatar findByName(String name);
    void updateAvatar(AvatarDto avatarDto);

}
