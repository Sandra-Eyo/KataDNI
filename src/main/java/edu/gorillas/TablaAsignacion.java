package edu.gorillas;


public class TablaAsignacion {

    private final char[] LETRAS_ASIGNACION = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                                              'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    public char getLetra(int indice) {
        return LETRAS_ASIGNACION[indice];
    }

    public boolean letraPermitida(char letra) {
        char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};
        for (char noPermitida : letrasNoPermitidas) {
            if (letra == noPermitida) {
                return false;
            }
        }
        return true;
    }

    public char calcularLetra(String parteNumericaDni) {
        int indice = Integer.parseInt(parteNumericaDni) % 23;
        return getLetra(indice);
    }

}
