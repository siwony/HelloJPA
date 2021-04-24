package helloJPA.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id
    private Long id;

    @Column(name = "USERNAME")
    private String name;
}
