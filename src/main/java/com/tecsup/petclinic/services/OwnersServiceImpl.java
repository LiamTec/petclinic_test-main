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
     * @param owner
     * @return
     */
    @Override
    public Owners create(Owners owner) {
        return ownersRepository.save(owner);
    }

    /**
     *
     * @param owner
     * @return
     */
    @Override
    public Owners update(Owners owner) {
        return ownersRepository.save(owner);
    }

    /**
     *
     * @param id
     * @throws OwnersNotFoundException
     */
    @Override
    public void delete(Integer id) throws OwnersNotFoundException {
        Owners owner = findById(id);
        ownersRepository.delete(owner);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Owners findById(Integer id) throws OwnersNotFoundException {
        Optional<Owners> owner = ownersRepository.findById(id);

        if (!owner.isPresent())
            throw new OwnersNotFoundException("Owner record not found...!");

        return owner.get();
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public List<Owners> findByName(String name) {
        List<Owners> owners = ownersRepository.findByName(name);
        owners.forEach(owner -> log.info("" + owner));
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
