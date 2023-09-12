package kr.co.ccmedia.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;

public interface UserRepository extends JpaRepository<UserEntity, Long> {


}
