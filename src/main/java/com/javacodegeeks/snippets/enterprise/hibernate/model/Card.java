package com.javacodegeeks.snippets.enterprise.hibernate.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@AllArgsConstructor
@Table(name = "Card")
public class Card {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id",length =  11, nullable = false)
    private Integer id;

    @Column(name = "clientId", length = 11, nullable = false)
    private String clientId;

    @Column(name = "bookId", length = 11, nullable = false)
    private String bookId;

    @Column(name = "date", nullable = false)
    private LocalDate date;

}