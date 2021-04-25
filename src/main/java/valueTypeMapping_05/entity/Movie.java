package valueTypeMapping_05.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter @Getter
public class Movie extends Item{

    private String directer;
    private String actor;
}
