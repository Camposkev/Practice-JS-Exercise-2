package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //USANDO EL IF
        String numerolf = "0";
        if (numerolf == "0") {  
            System.out.println("Es positivo");
        } else if (numerolf == "-1") {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        //USANDO WHILE
        int numeroWhile = 1;

            while (numeroWhile < 3){
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            }
            do {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            } while (numeroWhile < 3);

        //USANDO FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
                System.out.println(numeroFor);
            }

        //USANDO SWITCH
        var estacion = "verano";

            switch (estacion){
                case "verano":
                    System.out.println("es verano");
                    break;
                case "invierno":
                    System.out.println("es invierno");
                    break;
                case "primavera":
                    System.out.println("es primavera");
                    break;
                case "otoño":
                    System.out.println("es otoño");
                    break;
                default:
                    System.out.println("esto es un default");
            }
    }
}
