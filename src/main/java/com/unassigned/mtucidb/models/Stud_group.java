package com.unassigned.mtucidb.models;

import javax.persistence.*;

@Entity
public class Stud_group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @OneToOne()
    @JoinColumn(name = "kafedra_id")
    private Kafedra kafedra;

    public Stud_group() {
    }

    public Stud_group(String title, Kafedra kafedra) {
        this.title = title;
        this.kafedra = kafedra;
    }
}
