package edu.gorillas;

public class Dni {
    //Atributos:
    private String dni;
    private TablaAsignacion tabla = new TablaAsignacion();


    //Constructor:
    public Dni(String dni) {
        this.dni = dni;
    }


    //Getters y setters:
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }


    //Métodos:
    

}
