# SOLID DNI KATA - SRP y OCP - DAW DUAL 23/24

Este proyecto implementa las clases `Dni` y `TablaAsignacion` para para pasar los casos test proporcionados por `@dfleta`.

## Clases

### Dni

La clase `Dni` representa un número de DNI español. Proporciona métodos para validar el número y calcular la letra correspondiente.

#### Métodos

- `public Dni(String dni)`: Constructor que inicializa un objeto `Dni` con el número de DNI proporcionado.
- `public boolean isDniNumero(String parteNumerica)`: Verifica si la parte numérica del DNI es un número válido.
- `public String extraerParteNumericaDni()`: Extrae la parte numérica del DNI.
- `public boolean checkNumeroDni()`: Verifica si la parte numérica del DNI es un número válido.
- `public String extraerParteAlfabeticaDni()`: Extrae la parte alfabética (letra) del DNI.
- `public String obtenerLetra()`: Obtiene la letra correspondiente al número de DNI.
- `private char obtenerLetraChar()`: Obtiene la letra como un carácter.
- `public boolean checkLetra()`: Verifica si la letra del DNI es válida.
- `public boolean checkDni()`: Verifica si el número y la letra del DNI son válidos.

### TablaAsignacion

La clase `TablaAsignacion` proporciona una tabla de asignación para calcular la letra correspondiente a un número de DNI.

#### Métodos

- `public char getLetra(int indice)`: Obtiene la letra correspondiente al índice proporcionado en la tabla.
- `public boolean letraPermitida(char letra)`: Verifica si la letra es permitida según la tabla de asignación.
- `public char calcularLetra(String parteNumericaDni)`: Calcula la letra correspondiente a la parte numérica del DNI.

### Diagrama UML

