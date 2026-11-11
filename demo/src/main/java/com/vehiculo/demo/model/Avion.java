package com.vehiculo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "Avion")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "aerolinea", nullable = false, length = 80)
    String aerolinea;

    @Column(name = "fabricante", length = 60)
    String fabricante;

    @Column(name = "capacidad_pasajeros")
    int capacidadPasajeros;

    @Column(name = "altitud_maxima")
    int altitudMaxima;

    @Column(name = "tipo_turbina", length = 50)
    String tipoTurbina;

    public Avion() {
    }

    public Avion(String aerolinea, String fabricante, int capacidadPasajeros, int altitudMaxima, String tipoTurbina) {
        this.aerolinea = aerolinea;
        this.fabricante = fabricante;
        this.capacidadPasajeros = capacidadPasajeros;
        this.altitudMaxima = altitudMaxima;
        this.tipoTurbina = tipoTurbina;
    }

    public Avion(int id, String aerolinea, String fabricante, int capacidadPasajeros, int altitudMaxima, String tipoTurbina) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.fabricante = fabricante;
        this.capacidadPasajeros = capacidadPasajeros;
        this.altitudMaxima = altitudMaxima;
        this.tipoTurbina = tipoTurbina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public String getTipoTurbina() {
        return tipoTurbina;
    }

    public void setTipoTurbina(String tipoTurbina) {
        this.tipoTurbina = tipoTurbina;
    }

    public void despegar() {
        System.out.println("el Avion despega");
    }

    public void volar() {
        System.out.println("el Avion esta volando");
    }

    public void aterrizar() {
        System.out.println("el Avion aterriza");
    }
}