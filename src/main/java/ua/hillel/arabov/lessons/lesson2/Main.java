package ua.hillel.arabov.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        byte age;
        age=55;
        System.out.println(age);
        byte age2=25;
        System.out.println(age2);
        age2=35;
        System.out.println(age2);
        short shortVariable = 32700;
        System.out.println(shortVariable);

        int intVariable = 214700000;
        System.out.println(intVariable);

        long longVariable = 214700000000L;
        System.out.println(longVariable);

        float floatVariable = 1.12345678901F;
        double doubleVariable = 1.12345678901;
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        char charA = 'A';
        char charA2 = 65;
        char charA3 = '\u00B0';
        boolean isOk = true;

        System.out.println(charA);
        System.out.println(charA2);
        System.out.println(charA3);

        boolean inOk = true;
        System.out.println(inOk);

        String ctr = "Hello!";
        System.out.println(ctr + "   " + longVariable);

        System.out.println();
        System.out.println();

        byte demoByte = 125;
        short demoShort = demoByte;
        int demoInt = demoShort;

        System.out.println(demoByte);
        System.out.println(demoInt);
    }
}

