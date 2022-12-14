package com.example.kaddem.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe;
    private int salle ;
    private String thematique ;

    @OneToOne(mappedBy = "detail")
    private Equipe equipe ;
}
