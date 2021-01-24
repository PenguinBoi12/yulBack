package ca.onepoint.yul.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "type")
@Data
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
}
