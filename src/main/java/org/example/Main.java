package org.example;

public class Main {

    public static String primeraLetraMayuscula (String texto){
        if (texto == null || texto.isEmpty()){
            return "texto ingresado es nulo o esta vacio: " + texto;
        }
        return Character.toUpperCase(texto.charAt(0))+ texto.substring(1);
    }
    public static int calcularSuma (int numero1, int numero2){
        return numero1 + numero2;
    }
    public static char[] crearArrayLetrasDePalabra (String texto){
        char[] letras = new char[texto.length()];

        for (int i = 0; i< texto.length(); i++){
            letras[i] = texto.charAt(i);

        }
        return letras;
    }

    public static String permisoBeberAlcohol (int edad){

        if (edad < 18){
            return "No puede beber bebidas alcoholicas";
        }else{
            return "Puede beber bebidas alcoholicas";
        }
    }


    public static void main(String[] args) {

        String letraInicialMayuscula = primeraLetraMayuscula("leon");
        System.out.println(letraInicialMayuscula);
        int suma1 = calcularSuma(1, 5);
        System.out.println(suma1);
        char[] letrasTexto = crearArrayLetrasDePalabra("sebastian");
        System.out.println(letrasTexto);
        System.out.println(letrasTexto[2]);
        String puedebeber = permisoBeberAlcohol(45);
        System.out.println(puedebeber);

        

    }
}