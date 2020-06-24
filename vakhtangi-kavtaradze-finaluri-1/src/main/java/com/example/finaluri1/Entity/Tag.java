package com.example.finaluri1.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(targetEntity = Book.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Tag",referencedColumnName = "name")
    private String name;

}