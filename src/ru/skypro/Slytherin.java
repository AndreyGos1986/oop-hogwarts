package ru.skypro;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;

    public Slytherin(String name, String surname,
                     int cunning, int determination, int ambition, int resourcefulness,
                     int characterProperties, int magicPower, int transgress) {
        super(name, surname, characterProperties, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void getSlythStudentInfo() {
        System.out.println(getName() + " " + getSurname() + ": ");
        System.out.println("Очки хитрости: " + getCunning() + " " +
                "очки решительности: " + getDetermination() + " " +
                "очки амбициозности: " + getAmbition() + " " +
                "очки находчивости: " + getResourcefulness() + " " +
                "очки свойства характера: " + super.getCharacterProperties() + " " +
                "очки магической силы: " + super.getMagicPower() + " " +
                "дальность трансгрессирования: " + super.getTransgress());
        separator();
    }

    public static void compareSlythStudents(Slytherin slytherin1, Slytherin slytherin2) {
        int slyth1Summ = slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() +
                slytherin1.getTransgress() + slytherin1.getMagicPower() + slytherin1.getCharacterProperties();
        int slyth2Summ = slytherin2.getCunning() + slytherin2.getDetermination() + slytherin2.getAmbition() + slytherin2.getResourcefulness() +
                slytherin2.getTransgress() + slytherin2.getMagicPower() + slytherin2.getCharacterProperties();

        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "хитрость  - " + slytherin1.getCunning() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "хитрость  - " + slytherin2.getCunning() + " баллов.");
        System.out.println();
        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "решительность - " + slytherin1.getDetermination() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "решительность - " + slytherin2.getDetermination() + " баллов.");
        System.out.println();
        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "амбициозность  - " + slytherin1.getAmbition() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "амбициозность  - " + slytherin2.getAmbition() + " баллов.");
        System.out.println();
        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "находчивость  - " + slytherin1.getResourcefulness() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "находчивость  - " + slytherin2.getResourcefulness() + " баллов.");
        System.out.println();

        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "магическая сила  - " + slytherin1.getMagicPower() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "магическая сила  - " + slytherin2.getMagicPower() + " баллов.");
        System.out.println();
        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "трансгрессирование  - " + slytherin1.getTransgress() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "трансгрессирование  - " + slytherin2.getTransgress() + " баллов.");
        System.out.println();
        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " " + "свойства характера  - " + slytherin1.getCharacterProperties() + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " " + "свойства характера  - " + slytherin2.getCharacterProperties() + " баллов.");
        System.out.println();
        System.out.println("У " + slytherin1.getName() + " " + slytherin1.getSurname() +
                " общее количество баллов составило " + slyth1Summ + " баллов.");
        System.out.println("У " + slytherin2.getName() + " " + slytherin2.getSurname() +
                " общее количество баллов составило " + slyth2Summ + " баллов.");
        System.out.println();

        if (slyth1Summ > slyth2Summ) {
            System.out.println("И с результатом " + slyth1Summ + " баллов побеждает "
                    + slytherin1.getName() + " " + slytherin1.getSurname());
        } else {
            System.out.println("И с результатом " + slyth2Summ + " баллов побеждает "
                    + slytherin2.getName() + " " + slytherin2.getSurname());
        }
        separator();
    }

}
