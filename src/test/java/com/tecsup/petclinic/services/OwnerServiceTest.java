package com.tecsup.petclinic.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.tecsup.petclinic.entities.Owners;
import com.tecsup.petclinic.repositories.OwnersRepository;
import com.tecsup.petclinic.util.OwnersObjectCreator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class OwnerServiceTest {

	@Autowired
	private OwnersService ownerService;

	@Autowired
	private OwnersRepository ownersRepository;

	@Test
	public void testCreateOwner() {

		// Datos esperados
		String FIRST_NAME = "Josue";
		String LAST_NAME = "Mario";
		String ADDRESS = "Bros";
		String CITY = "Mushroom Kingdom";
		String TELEPHONE = "123456789";

		// Crear objeto Owners sin ID (nuevo)
		Owners owner = OwnersObjectCreator.newOwner();

		// Crear el owner en la base (servicio)
		Owners ownerCreated = this.ownerService.create(owner);

		log.info("OWNER CREATED: " + ownerCreated.toString());

		// Validaciones
		assertNotNull(ownerCreated.getId());  // Se generó ID al guardar
		assertEquals(FIRST_NAME, ownerCreated.getFirst_name());
		assertEquals(LAST_NAME, ownerCreated.getLast_name());
		assertEquals(ADDRESS, ownerCreated.getAddress());
		assertEquals(CITY, ownerCreated.getCity());
		assertEquals(TELEPHONE, ownerCreated.getTelephone());

	}
}
