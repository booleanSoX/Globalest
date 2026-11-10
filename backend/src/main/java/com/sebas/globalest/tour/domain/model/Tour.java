package com.sebas.globalest.tour.domain.model;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class Tour {
    final private BigInteger ID; //BigInteger para poder gestionar miles de posibles ID's, más que Int por defecto.
    private String name;
    private BigDecimal price; //BigDecimal para que los valores sean más completos que un float simple.
    private String description;
    private Duration duration; //Duration (PT2H30M) muy util para y fàcil de manejar para lapsos de tiempo.
    private GeoLocation location;
    private int capacity;
    private int agencyId;
    private Instant createdAt; //Instant para cuadrar los timestamps con la BBDD
    private Instant updatedAt; //idem

    public Tour(BigInteger ID, String name, BigDecimal price, String description, Duration duration, GeoLocation location, int capacity, int agencyId, Instant createdAt, Instant updatedAt) {

        if (price.compareTo(BigDecimal.ZERO) < 0 || capacity <= 0 || ID.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException(); //Detiene el proceso de creación de un objeto.
        }
        //Validaciones para crear un constructor seguro para evitar objetos inválidos para el dominio del programa.

        this.ID = ID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.duration = duration;
        this.location = location;
        this.capacity = capacity;
        this.agencyId = agencyId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        //Constructor :D
    }



}
