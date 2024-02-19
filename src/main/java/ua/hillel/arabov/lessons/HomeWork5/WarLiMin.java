package ua.hillel.arabov.lessons.HomeWork5;
public class WarLiMin {
    public static void main(String[] args) {

        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;

        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        int AttackRateWarriorLi = 860;
        int AttackRateArcherLi = 860;
        int AttackRateRiderLi = 860;

        double AttackRateWarriorMin = 1.5 * 860;
        double AttackRateArcherMin = 1.5 * 860;
        double AttackRateRiderMin = 1.5 * 860;

        int TotalAttckRateLi = (warriorLi * AttackRateWarriorLi) + (archerLi *
                AttackRateArcherLi) + (riderLi * AttackRateRiderLi);
        int TotalAttckRateMin = (int) ((warriorMin * AttackRateWarriorMin) + (archerMin *
                AttackRateArcherMin) + (riderMin * AttackRateRiderMin));

        System.out.println("Загальний показник атаки династії Лі: " + TotalAttckRateLi);
        System.out.println("Загальний показник атаки династії Мінь: " + TotalAttckRateMin);
    }
}