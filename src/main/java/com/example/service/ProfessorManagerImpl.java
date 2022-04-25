package com.example.service;

import java.util.List;

import com.example.dao.ProfessorDAO;
import com.example.model.Professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorManagerImpl implements ProfessorManager {

    @Autowired
    ProfessorDAO professorDAO;

    @Override
    public List<Professor> getProfessors() {

        return professorDAO.getProfessors();
    }
}
