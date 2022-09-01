/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EstudioArquitectura.Santa.Entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

    
@Entity
public class Usuario {

    // ATRIBUTOS
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id; // id autogenerado de tipo string

    @Column(unique = true) // es opcional, indica que los valores de esta columna son unicos.
    private String email;

    @Column(nullable = true) // no se permiten valores nulos
    private String nombre;

    private String apellido;

    @Transient // no va a persistir en la DB
    private Integer edad;


    // CONSTRUCTORES    
    public Usuario() {
    }
}
