package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.Models.modelEstado;
import com.example.demo.Services.estadoServices;

@Controller
public class mainController {

    @Autowired
    private estadoServices estadoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("estados", estadoService.getAllEstado());
        return "index";
    }

    // new
    @GetMapping("/new")
    public String newToy(Model model) {
        model.addAttribute("estado", new modelEstado());
        return "new";
    }

    @PostMapping("/add")
    public String add(modelEstado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/edit/{idEstado}") 
    public String edit(modelEstado estado, Model model) {
       estado = estadoService.find(estado.getIdEstado());
        model.addAttribute("estado", estado);
        return "editar";
    }

    @GetMapping("/delete/{idEstado}")
    public String delete(modelEstado estado, Model model) {
        estado = estadoService.find(estado.getIdEstado());
        estadoService.delete(estado);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(modelEstado estado) {
        estadoService.delete(estado);
        return "redirect:/";
    }

}
