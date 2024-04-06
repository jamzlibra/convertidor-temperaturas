import java.util.Scanner;

class ConvertidorTemperaturas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("¿Qué tipo de conversión desea realizar?");
            System.out.println("1. Celsius a Fahrenheit (°C a °F)");
            System.out.println("2. Fahrenheit a Celsius (°F a °C)");
            int opcion = teclado.nextInt();

            double temperaturaCelsius = 0;
            double temperaturaFahrenheit = 0;

            if (opcion == 1) {
                System.out.println("Ingrese la temperatura en grados Celsius (°C):");
                temperaturaCelsius = teclado.nextDouble();
                temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
                System.out.println("La temperatura en grados Fahrenheit (°F) es: " + String.format("%.2f", temperaturaFahrenheit) + "°F");
            } else if (opcion == 2) {
                System.out.println("Ingrese la temperatura en grados Fahrenheit (°F):");
                temperaturaFahrenheit = teclado.nextDouble();
                temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
                System.out.println("La temperatura en grados Celsius (°C) es: " + String.format("%.2f", temperaturaCelsius) + "°C");
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.println("¿Desea realizar otra conversión? (1: Sí, 2: No)");
            int otraConversion = teclado.nextInt();

            if (otraConversion != 1) {
                break; // Salir del bucle si el usuario no quiere realizar otra conversión
            }

        } while (true);

        teclado.close();
    }
}