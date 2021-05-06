/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yash.services;


import com.yash.bean.Footware;
import com.yash.repository.FootwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
/**
 *
 * @author nilam
 */
public class FootwareServices {

    @Autowired(required=true)
    FootwareRepository footwareRepository;

    public List<Footware> getAllFootwares() {
        List<Footware> footwares = new ArrayList<Footware>();
        footwareRepository.findAll().forEach(footware -> footwares.add(footware));
        return footwares;
    }

    public Footware getFootwareById(int id) {
        return footwareRepository.findById(id).get();
    }

    public void saveOrUpdate(Footware footware) {
        footwareRepository.save(footware);
    }

    public void delete(int id) {
        footwareRepository.deleteById(id);
    }
}
