package com.example.dao;

import com.example.model.Professor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

    @Override
    public List<Professor> getProfessors() {

        List<Professor> professorList = new ArrayList<>();

        professorList.add(new Professor("Yasmin", "Cheng", "Economics"));
        professorList.add(new Professor("Anita", "Smith", "Philosophy"));
        professorList.add(new Professor("Nick", "Goldberg", "Computer Science"));

        return professorList;
    }
}
