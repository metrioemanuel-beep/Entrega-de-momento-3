package com.vehiculo.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "Barco")
public class Barco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "naviera", nullable = false, length = 80)
    String naviera;

    @Column(name = "puerto_origen", length = 60)
    String puertoOrigen;

    @Column(name = "capacidad_contenedores")
    int capacidadContenedores;

    @Column(name = "eslora")
    int eslora;

    @Column(name = "tipo_casco", length = 50)
    String tipoCasco;

    public Barco() {
    }

    public Barco(String naviera, String puertoOrigen, int capacidadContenedores, int eslora, String tipoCasco) {
        this.naviera = naviera;
        this.puertoOrigen = puertoOrigen;
        this.capacidadContenedores = capacidadContenedores;
        this.eslora = eslora;
        this.tipoCasco = tipoCasco;
    }

    public Barco(int id, String naviera, String puertoOrigen, int capacidadContenedores, int eslora, String tipoCasco) {
        this.id = id;
        this.naviera = naviera;
        this.puertoOrigen = puertoOrigen;
        this.capacidadContenedores = capacidadContenedores;
        this.eslora = eslora;
        this.tipoCasco = tipoCasco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaviera() {
        return naviera;
    }

    public void setNaviera(String naviera) {
        this.naviera = naviera;
    }

    public String getPuertoOrigen() {
        return puertoOrigen;
    }

    public void setPuertoOrigen(String puertoOrigen) {
        this.puertoOrigen = puertoOrigen;
    }

    public int getCapacidadContenedores() {
        return capacidadContenedores;
    }

    public void setCapacidadContenedores(int capacidadContenedores) {
        this.capacidadContenedores = capacidadContenedores;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    public void zarpar() {
        System.out.println("el Barco zarpa");
    }

    public void navegar() {
        System.out.println("el Barco esta navegando");
    }

    public void anclar() {
        System.out.println("el Barco ancla");
    }
} 
    

