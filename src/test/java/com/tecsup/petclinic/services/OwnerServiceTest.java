package com.tecsup.petclinic.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exceptions.OwnerNotFoundException;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class OwnerServiceTest {

	@Autowired
	private OwnerService ownerService;

	@Test
	public void testFindOwnerById() {
		Integer ID = 1;
		String FIRST_NAME_EXPECTED = "George";

		Owner owner = null;
		try {
			owner = ownerService.findById(ID);
		} catch (OwnerNotFoundException e) {
			fail(e.getMessage());
		}
		assertEquals(FIRST_NAME_EXPECTED, owner.getFirstName());
	}

	@Test
	public void testFindOwnerByFirstName() {
		String FIND_FIRST_NAME = "George";
		int EXPECTED_SIZE = 1;

		List<Owner> owners = ownerService.findByFirstName(FIND_FIRST_NAME);

		assertEquals(EXPECTED_SIZE, owners.size());
	}
}