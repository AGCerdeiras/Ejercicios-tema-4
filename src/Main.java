public class Main {
    public static <string> void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);

        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "";
        switch (estacion) {
            case "verano":
                System.out.println("Estás en verano");
                break;
            case "invierno":
                System.out.println("Estás en invierno");
                break;
            case "primavera":
                System.out.println("Estás en primavera");
                break;
            case "otoño":
                System.out.println("Estás en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }

}