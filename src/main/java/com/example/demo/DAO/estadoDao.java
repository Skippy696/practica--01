package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Models.modelEstado;

@Repository
public interface estadoDao extends CrudRepository<modelEstado, Long> {

    

}
