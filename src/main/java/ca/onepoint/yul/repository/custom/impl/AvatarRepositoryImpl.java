package ca.onepoint.yul.repository.custom.impl;

import ca.onepoint.yul.dto.AvatarDto;
import ca.onepoint.yul.entity.Avatar;
import ca.onepoint.yul.repository.custom.AvatarRepositoryCustom;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


public class AvatarRepositoryImpl implements AvatarRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public AvatarDto findByIdAvatar(Integer id) {
        // Construction de la requête
        StringBuilder queryBuilder = new StringBuilder();
        // Clause SELECT
        queryBuilder.append("SELECT a.id, a.name, a.type, a.image, a.waiting, a.main, a.x, a.y ");
        // Clause FROM
        queryBuilder.append("FROM Avatar a ");
        // Clause WHERE
        queryBuilder.append("WHERE a.id = '" + id + "' ");

        Query query = entityManager.createQuery(queryBuilder.toString());
        return mappingAvatartoDto(query.getResultList());
    }

    @Override
    public List<Avatar> findByType(Integer id) {
        // Construction de la requête
        StringBuilder queryBuilder = new StringBuilder();
        // Clause SELECT
        queryBuilder.append("SELECT a.id, a.name, a.type, a.image, a.waiting, a.main, a.x, a.y ");
        // Clause FROM
        queryBuilder.append("FROM Avatar a ");
        // Clause WHERE
        queryBuilder.append("WHERE a.type = '" + id + "' ");

        Query query = entityManager.createNativeQuery(queryBuilder.toString(), Avatar.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public void createAvatar(Avatar avatar) {
        System.out.println("HERE " + avatar.getName());
        entityManager.createNativeQuery("INSERT INTO avatar (name, type, image, waiting, main, x, y) VALUES (?,?,?,?,?,?,?)")
                .setParameter(1, avatar.getName())
                .setParameter(2, avatar.getType())
                .setParameter(3, avatar.getImage())
                .setParameter(4, avatar.getWaiting())
                .setParameter(5, avatar.getMain())
                .setParameter(6, avatar.getX())
                .setParameter(7, avatar.getY())
                .executeUpdate();
    }

    private AvatarDto mappingAvatartoDto(List<Object[]> infos) {
        Object[] avatar = infos.get(0);
        AvatarDto avatarDto = new AvatarDto();
        avatarDto.setId((Integer) avatar[0]);
        avatarDto.setName((String) avatar[1]);
        avatarDto.setType((Integer) avatar[2]);
        avatarDto.setImage((String) avatar[3]);
        avatarDto.setWaiting((Integer) avatar[4]);
        avatarDto.setMain((Integer) avatar[5]);
        avatarDto.setX((Integer) avatar[6]);
        avatarDto.setY((Integer) avatar[7]);
        return avatarDto;
    }




}
