package com.example.finaluri1.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(targetEntity = Book.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="attachment",referencedColumnName = "pdfurl")
    private String pdfurl;

//    private Post post;
}