package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.estadoDao;
import com.example.demo.Models.modelEstado;

import org.springframework.transaction.annotation.Transactional;

@Service
public class estadoServicesImp implements estadoServices {
    @Autowired
    private estadoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<modelEstado> getAllEstado() {
        return (List<modelEstado>) dao.findAll();
    }

    @Override
    @Transactional
    public void save(modelEstado estado) {
        dao.save(estado);
    }

    @Override
    @Transactional
    public void delete(modelEstado estado) {
        dao.delete(estado);
    }

    @Override
    @Transactional(readOnly = true)
    public modelEstado getEstado(modelEstado estado) {
        return dao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public modelEstado find(Long id) {
        return dao.findById(id).orElse(null);
    }


    

}
