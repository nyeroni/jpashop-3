package jpabook.jpashop.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@DiscriminatorValue("A")
@Entity
@Getter
@Setter
public class Album extends Item {
    private String artist;
    private String etc;
}
