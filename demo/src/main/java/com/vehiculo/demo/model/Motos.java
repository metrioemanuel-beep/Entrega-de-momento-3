package com.vehiculo.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "Motos")
public class Motos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "marca", nullable = false, length = 50)
    String marca;

    @Column(name = "consesionario", length = 100)
    String consesionario;

    @Column(name = "precios")
    int precios;

    @Column(name = "caballosdefuerza")
    int caballosdefuerza;

    @Column(name = "ubicacion", length = 100)
    String ubicacion;

    public Motos() {
    }


    public Motos(int id, String marca, String consesionario, int precios, int caballosdefuerza, String ubicacion) {
        this.id = id;
        this.marca = marca;
        this.consesionario = consesionario;
        this.precios = precios;
        this.caballosdefuerza = caballosdefuerza;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getConsesionario() {
        return consesionario;
    }

    public void setConsesionario(String consesionario) {
        this.consesionario = consesionario;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public int getCaballosdefuerza() {
        return caballosdefuerza;
    }

    public void setCaballosdefuerza(int caballosdefuerza) {
        this.caballosdefuerza = caballosdefuerza;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void arrancar() {
        System.out.println("la moto arranca");
    }

    public void acelerar() {
        System.out.println("la moto acelera");
    }

    public void frenar() {
        System.out.println("la moto frena");
    }
}