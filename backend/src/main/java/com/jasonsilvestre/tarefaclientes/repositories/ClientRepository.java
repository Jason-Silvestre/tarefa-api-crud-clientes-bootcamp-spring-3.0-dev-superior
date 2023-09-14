package com.jasonsilvestre.tarefaclientes.repositories;

import com.jasonsilvestre.tarefaclientes.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
