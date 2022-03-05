package com.unassigned.mtucidb.models;

import javax.persistence.*;

@Entity
public class Kafedra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "dekanat", nullable = false)
    private String dekanat;

    public Kafedra() {
    }

    public Kafedra(String title, String dekanat) {
        this.title = title;
        this.dekanat = dekanat;
    }
}

