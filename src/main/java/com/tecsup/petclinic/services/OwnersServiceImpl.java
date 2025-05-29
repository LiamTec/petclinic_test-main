package com.tecsup.petclinic.services;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.entities.Owners;
import com.tecsup.petclinic.exceptions.OwnersNotFoundException;
import com.tecsup.petclinic.repositories.OwnersRepository;

@Service
@Slf4j
public class OwnersServiceImpl implements OwnersService {

    OwnersRepository ownersRepository;

    public OwnersServiceImpl(OwnersRepository ownersRepository) {
        this.ownersRepository = ownersRepository;
    }

    /**
     *
     * @param owners
     * @return
     */
    @Override
    public Owners create(Owners owners) {
        return ownersRepository.save(owners);
    }

    /**
     *
     * @param owners
     * @return
     */
    @Override
    public Owners update(Owners owners) {
        return ownersRepository.save(owners);
    }

    /**
     *
     * @param id
     * @throws OwnersNotFoundException
     */
    @Override
    public void delete(Integer id) throws OwnersNotFoundException {
        Owners owners = findById(id);
        ownersRepository.delete(owners);
    }

    /**
     *
     * @param id
     * @return
     * @throws OwnersNotFoundException
     */
    @Override
    public Owners findById(Integer id) throws OwnersNotFoundException {
        Optional<Owners> owners = ownersRepository.findById(id);
        if (!owners.isPresent())
            throw new OwnersNotFoundException("Record not found...!");
        return owners.get();
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public List<Owners> findByName(String name) {
        List<Owners> owners = ownersRepository.findByFirstName(name);
        owners.forEach(owner -> log.info(" " + owner));
        return owners;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Owners> findAll() {
        return ownersRepository.findAll();
    }
}
