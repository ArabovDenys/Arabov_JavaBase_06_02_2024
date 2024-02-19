package ua.hillel.arabov.lessons.HomeWork4;

public class Main {
    public static void main(String[] args) {
        int length = 5;
        int height = 4;
        int width = 3;

        int volume = length * height * width;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        int totalLength = (length + width + height) * 4;

        System.out.println("Сумарна довжина всіх сторін = " + totalLength);
    }
}
