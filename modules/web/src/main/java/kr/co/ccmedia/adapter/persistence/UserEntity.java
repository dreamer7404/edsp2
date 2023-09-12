package kr.co.ccmedia.adapter.persistence;

import lombok.*;

import javax.persistence.*;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;

@Table
@Entity(name="tb_user")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;




}
