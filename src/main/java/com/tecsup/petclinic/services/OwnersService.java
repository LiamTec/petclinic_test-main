package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Owners;
import com.tecsup.petclinic.exceptions.OwnersNotFoundException;

public interface OwnersService {

    /**
     *
     * @param owner
     * @return
     */
    Owners create(Owners owner);

    /**
     *
     * @param owner
     * @return
     */
    Owners update(Owners owner);

    /**
     *
     * @param id
     * @throws OwnersNotFoundException
     */
    void delete(Integer id) throws OwnersNotFoundException;

    /**
     *
     * @param id
     * @throws OwnersNotFoundException
     */
    Owners findById(Integer id) throws OwnersNotFoundException;

    /**
     *
     * @param name
     * @return
     */
    List<Owners> findByName(String name);

    /**
     *
     * @return
     */
    List<Owners> findAll();
}
