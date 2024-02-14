package ua.hillel.arabov.lessons.lesson2;

public class MyApp {
    public static void main(String[] args) {

        char charX = '\u002c';
        char charY = '\u00B0';
        char charZ = '\u02B9';
        char charO = '\u0022';

        byte ageX = 41;
        byte ageY = 53;
        byte ageZ = 12;
        byte ageO = 29;

        double doubleA = 41.890208;
        double doubleB = 12.492395;
        double doubleC = 24.8;
        double doubleD = 32.6;

        System.out.println("Piazza de Colosseo" + charX + "Roma" + charX + "RM" + charX + "Italia");
        System.out.println("Latitude" + " " + doubleA + "  " + "Longitude" + " " + doubleB);
        System.out.print("DMS Lat" + " " + ageX + charY + ageY + charZ + doubleC + charO + "N" + "  " );
        System.out.println("DMS Long" + " " + ageZ + charY + ageO + charZ + doubleD + charO + "E");
    }
}