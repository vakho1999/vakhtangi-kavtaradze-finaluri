package com.example.finaluri1.Entity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;



@Data
@Entity
public class author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ToString.Exclude
    @ManyToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="author",referencedColumnName = "id")
    private Long id;
    private String firstname;
    private String lastname;

}