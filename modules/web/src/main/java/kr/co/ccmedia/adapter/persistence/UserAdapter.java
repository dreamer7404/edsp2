package kr.co.ccmedia.adapter.persistence;

import kr.co.ccmedia.domain.User;
import kr.co.ccmedia.port_out.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserAdapter implements UserPort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Long create(User user) {
        UserEntity userEntity = userMapper.toEntity(user);

        return userRepository
                .save(userEntity)
                .getId();



    }
}
