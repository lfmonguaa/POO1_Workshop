import jdk.dynalink.linker.support.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        int c=0;
        c=a+b;
        return c;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.

        if((a>b) && (a>c)){
            return a;
        }
        else if ((b>a)&&(b>c)){
            return b;
        }
        else {
            return c;
        }
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        int[]tabla = new int[limite];
        for(int i=0;i<limite;i++){
            tabla[i] = numero*(i+1);
        }

        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        int c=1;
        for (int i = 1; i <= n; i++) {
            c = c*i;
        }
        return c;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if(numero<=1){
            return false;
        }
        for(int i=2;i*i<=numero;i++)
            if(numero % i==0) return false;
        return true;

    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        int[]tabla = new int[n];
        int n1=1,n2=0;
        if(n==0){
            return new int[0];
        }
        else if(n==1){
            tabla[0]=n2;
        }
        else{
            tabla[0]=n2;
            tabla[1]=n1;
            for(int i=2;i<n;i++){
                tabla[i] = tabla[i-1]+tabla[i-2];
            }

        }
        return tabla;
    }



    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int c=0;
        for (int i = 0; i < arreglo.length ; i++) {
            c = arreglo[i] + c;
        }
        return c;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        double c=0;
        for (int i = 0; i < arreglo.length ; i++) {
            c = arreglo[i] + c;
        }
        c = c / arreglo.length;
        return c;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int c=0;
        for (int i = 0; i < arreglo.length ; i++) {
            if (c < arreglo[i]) {
                c=arreglo[i];
            }
        }
        return c;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int c=arreglo[0];
        for (int i = 0; i < arreglo.length ; i++) {
            if (c > arreglo[i]) {
                c=arreglo[i];
            }
        }
        return c;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        for (int i = 0; i < arreglo.length ; i++) {
            if (elemento == arreglo[i]) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        for (int i = 0;i < arreglo.length/2 ; i++) {
            int j = arreglo.length-i-1;
            int a = arreglo[i];
            int b = arreglo[j];
            arreglo[i] = b;
            arreglo[j] = a;
        }
        if (arreglo.length == 0){
            return new int[0];
        }
        return arreglo;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        Arrays.sort(arreglo);
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        return java.util.Arrays.stream(arreglo).distinct().toArray();
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int[]tabla = new int[arreglo1.length + arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++) {
            tabla[i] = arreglo1[i];
        }
        int c =0;
        for (int i = arreglo1.length; i < (arreglo1.length + arreglo2.length); i++) {
            tabla[i] = arreglo2[c];
            c++;
        }
        return tabla;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        if (arreglo.length == 0 || posiciones == 0) {
            return arreglo.clone();
        }

        int tamaño = arreglo.length;
        posiciones = posiciones % tamaño;
        if (posiciones < 0) {
            posiciones += tamaño;
        }

        int[] resultado = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            int nuevaPos = (i + posiciones) % tamaño;
            resultado[nuevaPos] = arreglo[i];
        }

        return resultado;

    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        if (cadena == null) {
            return 0;
        }
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        if (cadena == null || cadena.isEmpty()) {
            return cadena;
        }
        char[] caracteres = cadena.toCharArray();
        int i = 0;
        int j = caracteres.length - 1;
        while (i < j) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
            i++;
            j--;
        }
        return new String(caracteres);
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        String normalizada = cadena.replace(" ", "").toLowerCase();
        List<String> letras = Arrays.asList(normalizada.split(""));
        int n = letras.size();
        for (int i = 0; i < n / 2; i++) {
            if (!letras.get(i).equals(letras.get(n - 1 - i))) {
                return false;
            }
        }

        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        List<String> palabras = Arrays.asList(cadena.trim().split("\\s+"));
        return palabras.size();
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        if (cadena == null) {
            return "";
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (correo == null || correo.isEmpty()) return false;
        if (correo.contains(" ")) return false;
        int atIndex = correo.indexOf('@');
        if (atIndex <= 0 || atIndex != correo.lastIndexOf('@') || atIndex == correo.length() - 1) return false;
        String local = correo.substring(0, atIndex);
        String dominio = correo.substring(atIndex + 1);
        if (!dominio.contains(".") || dominio.startsWith(".") || dominio.endsWith(".")) return false;
        for (char c : correo.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '@' && c != '.') {
                return false;
            }
        }

        return true;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (int numero : lista) {
            suma += numero;
        }

        return (double) suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        if (numero == 0) {
            return "0";
        }
        String binario = Integer.toBinaryString(Math.abs(numero));
        return numero < 0 ? "-" + binario : binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        if (numero == 0) return "0";
        String hex = Integer.toHexString(Math.abs(numero)).toUpperCase();
        return numero < 0 ? "-" + hex : hex;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionComputadora = opciones[(int)(Math.random() * 5)];

        if (eleccionUsuario.equals(eleccionComputadora)) return "Empate";

        switch (eleccionUsuario) {
            case "Piedra":
                return (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto")) ? "Ganaste" : "Perdiste";
            case "Papel":
                return (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock")) ? "Ganaste" : "Perdiste";
            case "Tijera":
                return (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto")) ? "Ganaste" : "Perdiste";
            case "Lagarto":
                return (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel")) ? "Ganaste" : "Perdiste";
            case "Spock":
                return (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra")) ? "Ganaste" : "Perdiste";
            default:
                return "Opción inválida";
        }
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        String p1 = game[0];
        String p2 = game[1];

        if (p1.equals(p2)) return "Empate";

        if (
                (p1.equals("R") && (p2.equals("L") || p2.equals("S"))) ||
                        (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
                        (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
                        (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) ||
                        (p1.equals("V") && (p2.equals("S") || p2.equals("R")))
        ) {
            return "Player 1";
        }

        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * (radio * radio);
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1 || day > 31) return "Invalid Date";
        if ((month == 2 && day > 29) || ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
            return "Invalid Date";
        }

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Pisces";

        return "Invalid Date";
    }


}

