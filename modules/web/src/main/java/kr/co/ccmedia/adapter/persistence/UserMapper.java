package kr.co.ccmedia.adapter.persistence;

import kr.co.ccmedia.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toDomain(UserEntity entity){
        return User.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }


    public UserEntity toEntity(User user){
        return UserEntity.builder()
                .name(user.getName())
                .build();
    }
}
