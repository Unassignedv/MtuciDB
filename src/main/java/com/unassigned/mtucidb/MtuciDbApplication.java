package com.unassigned.mtucidb;

import com.unassigned.mtucidb.models.Kafedra;
import com.unassigned.mtucidb.models.Stud_group;
import com.unassigned.mtucidb.models.Student;
import com.unassigned.mtucidb.repositories.KafedraRepository;
import com.unassigned.mtucidb.repositories.Stud_groupRepository;
import com.unassigned.mtucidb.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MtuciDbApplication implements CommandLineRunner {

    @Autowired
    private KafedraRepository kafedraRepository;

    @Autowired
    private Stud_groupRepository stud_groupRepository;

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MtuciDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Kafedra kafedra1 = new Kafedra("kafedra1", "dekanat1");
        kafedraRepository.save(kafedra1);
        Kafedra kafedra2 = new Kafedra("kafedra2", "dekanat2");
        kafedraRepository.save(kafedra2);


        Stud_group stud_group1 = new Stud_group("stud_group1", kafedra1);
        stud_groupRepository.save(stud_group1);
        Stud_group stud_group2 = new Stud_group("stud_group2", kafedra2);
        stud_groupRepository.save(stud_group2);
        Stud_group stud_group3 = new Stud_group("stud_group3", kafedra1);
        stud_groupRepository.save(stud_group3);
        Stud_group stud_group4 = new Stud_group("stud_group4", kafedra2);
        stud_groupRepository.save(stud_group4);

        Student student1 = new Student("name1", stud_group1);
        studentRepository.save(student1);
        Student student2 = new Student("name2", stud_group1);
        studentRepository.save(student2);
        Student student3 = new Student("name3", stud_group1);
        studentRepository.save(student3);
        Student student4 = new Student("name4", stud_group1);
        studentRepository.save(student4);
        Student student5 = new Student("name5", stud_group1);
        studentRepository.save(student5);
        Student student6 = new Student("name6", stud_group2);
        studentRepository.save(student6);
        Student student7 = new Student("name7", stud_group2);
        studentRepository.save(student7);
        Student student8 = new Student("name8", stud_group2);
        studentRepository.save(student8);
        Student student9 = new Student("name9", stud_group2);
        studentRepository.save(student9);
        Student student10 = new Student("name10", stud_group2);
        studentRepository.save(student10);
        Student student11 = new Student("name11", stud_group3);
        studentRepository.save(student11);
        Student student12 = new Student("name12", stud_group3);
        studentRepository.save(student12);
        Student student13 = new Student("name13", stud_group3);
        studentRepository.save(student13);
        Student student14 = new Student("name14", stud_group3);
        studentRepository.save(student14);
        Student student15 = new Student("name15", stud_group3);
        studentRepository.save(student15);
        Student student16 = new Student("name16", stud_group4);
        studentRepository.save(student16);
        Student student17 = new Student("name17", stud_group4);
        studentRepository.save(student17);
        Student student18 = new Student("name18", stud_group4);
        studentRepository.save(student18);
        Student student19 = new Student("name19", stud_group4);
        studentRepository.save(student19);
        Student student20 = new Student("name20", stud_group4);
        studentRepository.save(student20);
    }
}
