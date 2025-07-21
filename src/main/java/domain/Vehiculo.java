package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "vehiculos",schema = "esquema")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vehiculo;
    private String placa;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public Vehiculo(int id_vehiculo, String placa, String marca) {
        this.id_vehiculo = id_vehiculo;
        this.placa = placa;
        this.marca = marca;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id_vehiculo=" + id_vehiculo + ", placa=" + placa + ", marca=" + marca + '}';
    }
    
}
