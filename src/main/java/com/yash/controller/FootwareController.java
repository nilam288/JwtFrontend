/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yash.controller;

/**
 *
 * @author nilam
 */
import com.yash.bean.Footware;
import com.yash.services.FootwareServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.boot.autoconfigure.web.ErrorController;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class FootwareController{
    @Autowired(required=true)
    FootwareServices footwareServices;

    @GetMapping("/footware")
    private List<Footware> getAllFootwares() {
        return footwareServices.getAllFootwares();
    }

    @GetMapping("/footware/{id}")
    private Footware getFootware(@PathVariable("id") int id) {
        return footwareServices.getFootwareById(id);
    }

    @DeleteMapping("/footware/{id}")
    private void deleteFootware(@PathVariable("id") int id) {
        footwareServices.delete(id);
    }

    @PostMapping("/footware")
    private int saveFootware(@RequestBody Footware footware) {
        footwareServices.saveOrUpdate(footware);
        return footware.getId();
    }
}
