package com.javacodegeeks.snippets.enterprise.hibernate.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@AllArgsConstructor()
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "identity")
    @Column(name = "id",length =  11, nullable = false)
    private Integer id;

    @Column(name = "title", length = 20)
    private String title;

    @Column(name = "author", length = 50)
    private String author;

}