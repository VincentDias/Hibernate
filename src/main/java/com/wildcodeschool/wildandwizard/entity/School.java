package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;

// TODO : update this entity
@Entity
@Table(name="school")

public class School {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="capacity")
    private Long capacity;

    @Column(name="country")
    private String country;

    public School() {
    }

    /**
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the capacity
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity the capacity to set
     */
    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}