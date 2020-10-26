package org.concertManagement.entities;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "arenas")
public class Arena {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "capacity")
    private int capacity;

    public Arena(){

    }

    public Arena(String name, String address, int capacity){
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public UUID getId() {
        return id;
    }
}
