package com.example.demo.Services;

import java.util.List;

import com.example.demo.Models.modelEstado;

public interface estadoServices {
        
        public List<modelEstado> getAllEstado();

        public void save(modelEstado estado);

        public void delete(modelEstado estado);

        public modelEstado getEstado(modelEstado estado);

        public modelEstado find(Long id);


     



        



    
}
