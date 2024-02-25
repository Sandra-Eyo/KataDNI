package edu.gorillas;


public class Dni {
    //Atributos:
    private String dni;


    //Constructor:
    public Dni(String dni) {
        this.dni = dni.toUpperCase();
    }


    //Getters y setters:
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    //Métodos:
    public boolean isDniNumero(String parteNumerica) {
        for (int i = 0; i < parteNumerica.length(); i++) {
            if (!Character.isDigit(parteNumerica.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String extraerParteNumericaDni() {
        String parteNumerica = "";

        for (int i = 0; i < dni.length() - 1; i++) {
            parteNumerica += dni.charAt(i);
        }

        return parteNumerica;
    }

    public boolean checkNumeroDni() {
        return isDniNumero(extraerParteNumericaDni());
    }

    public String extraerParteAlfabeticaDni() {
        return dni.substring(dni.length() - 1);
    }

    public String obtenerLetra() {
        return String.valueOf(obtenerLetraChar());
    }

    private char obtenerLetraChar() {
        TablaAsignacion tabla = new TablaAsignacion();
        int indice = Integer.parseInt(extraerParteNumericaDni()) % 23;
        return tabla.getLetra(indice);
    }

    public boolean checkLetra() {
        return extraerParteAlfabeticaDni().charAt(0) == obtenerLetraChar();
    }

    public boolean checkDni() {
        return checkNumeroDni() && checkLetra();
    }
}

