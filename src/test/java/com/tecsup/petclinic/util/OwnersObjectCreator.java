package com.tecsup.petclinic.util;

import com.tecsup.petclinic.entities.Owners;

import java.util.ArrayList;
import java.util.List;

public class OwnersObjectCreator {

    public static Owners getOwner() {
        return new Owners("Pepe", "George", "110. Wilberity", "110 W. Liberty St.", "6085551023");
    }

    public static Owners newOwner() {
        return new Owners("Josue", "Mario", "Bros", "Mushroom Kingdom", "123456789");
    }

    public static Owners newOwnerCreated() {
        Owners owner = newOwner();
        owner.setId(1000);
        return owner;
    }

    public static Owners newOwnerForUpdate() {
        return new Owners("Armando", "Luigi", "Green", "Yoshi Island", "987654321");
    }

    public static Owners newOwnerCreatedForUpdate() {
        Owners owner = newOwnerForUpdate();
        owner.setId(4000);
        return owner;
    }

    public static Owners newOwnerForDelete() {
        return new Owners("Luis", "Peach", "Toadstool", "Castle Road", "555123456");
    }

    public static Owners newOwnerCreatedForDelete() {
        Owners owner = newOwnerForDelete();
        owner.setId(2000);
        return owner;
    }

    public static List<Owners> getOwnersForFindByFirstName() {
        List<Owners> owners = new ArrayList<>();
        owners.add(new Owners("Rodrigo", "George", "Smith", "Main St.", "111111111"));
        return owners;
    }

    public static List<Owners> getOwnersForFindByLastName() {
        List<Owners> owners = new ArrayList<>();
        owners.add(new Owners("Juan", "Ana", "Franklin", "River Rd.", "222222222"));
        owners.add(new Owners("Liam", "John", "Franklin", "Ocean Ave.", "333333333"));
        return owners;
    }
}
