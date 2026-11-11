 package com.vehiculo.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mercedes")
public class Mercedes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "nombre", nullable = false, length = 100)
     String nombre;

    @Column(name = "motor", length = 50)
    String motor;

    @Column(name = "modelo")
     int modelo;

    @Column(name = "velocidad")
   int velocidad;

    @Column(name = "color", length = 30)
     String color;

    public Mercedes() {
    }

    public Mercedes(String nombre, String motor, int modelo, int velocidad, String color) {
        this.nombre = nombre;
        this.motor = motor;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.color = color;
    }

    public Mercedes(int id, String nombre, String motor, int modelo, int velocidad, String color) {
        this.id = id;
        this.nombre = nombre;
        this.motor = motor;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void arrancar() {
        System.out.println("el carro arranca");
    }

    public void avanzar() {
        System.out.println("el carro avanza");
    }

    public void frenar() {
        System.out.println("el carro frena");
    }
}