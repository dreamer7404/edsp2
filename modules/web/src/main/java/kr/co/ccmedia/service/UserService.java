package kr.co.ccmedia.service;

import kr.co.ccmedia.domain.User;
import kr.co.ccmedia.port_in.UserUseCase;
import kr.co.ccmedia.port_out.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {
    private final UserPort userPort;

    @Override
    public Long create(String name) {
        User user = User.builder()
                .name(name)
                .build();
        return userPort.create(user);
    }
}
