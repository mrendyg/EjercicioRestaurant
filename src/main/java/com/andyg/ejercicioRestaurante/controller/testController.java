package com.andyg.ejercicioRestaurante.controller;

import com.andyg.ejercicioRestaurante.entity.Plato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class testController {

    @GetMapping("/platos/{id}")
    @ResponseBody
    public Plato mostarPlato(@PathVariable long id) {

        List<Plato> listPlato = new ArrayList<Plato>();
        //simulacion de la DB
        listPlato.add(new Plato(1, "Mechada con pure", 15000, "Mechada al jugo con pure natural"));
        listPlato.add(new Plato(2, "Pescado asado", 20000, "Pescado a la parilla con ensalada"));
        listPlato.add(new Plato(3, "Sanwich de queso", 3000, "Pan de molde con queso gauda"));
        listPlato.add(new Plato(4, "Parrillada", 50000, "mix de carnes a la parrilla"));
        listPlato.add(new Plato(5, "Vegetariano", 30000, "Mix de vegetales sasonados"));

            for (Plato plato : listPlato){
                if (plato.getId() == id){
                    return plato;
                }
            }

        return null;
    }

}
