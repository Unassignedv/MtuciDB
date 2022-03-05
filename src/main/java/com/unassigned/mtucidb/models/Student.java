package com.unassigned.mtucidb.models;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne()
    @JoinColumn(name = "stud_group_id")
    private Stud_group stud_group;

    public Student() {
    }

    public Student(String name, Stud_group stud_group) {
        this.name = name;
        this.stud_group = stud_group;
    }
}

