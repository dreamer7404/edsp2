package kr.co.ccmedia.adapter.controller;

import kr.co.ccmedia.port_in.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @GetMapping("/user/{name}")
    public Long createUser(@PathVariable("name") String name){
        return userUseCase.create(name);
    }
}
