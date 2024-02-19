package ua.hillel.arabov.lessons.HomeWork5;

public class Main {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;

        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        int AttackRateLi = 860;
        int AttackRateMin = (int) (AttackRateLi * 1.5);

        int totalAttackRateLi = AttackRateLi * (warriorLi + archerLi + riderLi);
        int totalAttackRateMin = AttackRateMin * (warriorMin + archerMin + riderMin);

        System.out.println("Загальний показник атаки династії Лі: " + totalAttackRateLi);
        System.out.println("Загальний показник атаки династії Мінь: " + totalAttackRateMin);
    }
}
