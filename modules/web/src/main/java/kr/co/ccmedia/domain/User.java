package kr.co.ccmedia.domain;

import lombok.Builder;

public class User {

    private Long id;
    private String name;

    @Builder
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
