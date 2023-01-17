/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.biblioteca.repositorios;

import com.egg.biblioteca.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adria
 */
@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {
    
}
