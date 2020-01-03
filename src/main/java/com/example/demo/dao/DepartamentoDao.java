package com.example.demo.dao;


import java.util.List;

import com.example.demo.web.domain.*;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
