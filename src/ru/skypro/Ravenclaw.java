package ru.skypro;

public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wise;
    private int creativity;

    public Ravenclaw(String name, String surname,
                     int smart, int wise, int creativity,
                     int characterProperties, int magicPower, int transgress) {
        super(name, surname, characterProperties, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getCreativity() {
        return creativity;
    }

    public void getRavenStudentInfo() {
        System.out.println(getName() + " " + getSurname() + ": ");
        System.out.println("Очки ума: " + getSmart() + " " +
                "очки мудрости: " + getWise() + " " +
                "очки креативности: " + getCreativity() + " " +
                "очки свойства характера: " + super.getCharacterProperties() + " " +
                "очки магической силы: " + super.getMagicPower() + " " +
                "дальность трансгрессирования: " + super.getTransgress());
        separator();
    }

    public static void compareRavenStudents(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int raven1Summ = ravenclaw1.getSmart() + ravenclaw1.getWise() + ravenclaw1.getCreativity() +
                ravenclaw1.getTransgress() + ravenclaw1.getMagicPower() + ravenclaw1.getCharacterProperties();
        int raven2Summ = ravenclaw2.getSmart() + ravenclaw2.getWise() + ravenclaw2.getCreativity() +
                ravenclaw2.getTransgress() + ravenclaw2.getMagicPower() + ravenclaw2.getCharacterProperties();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " " + "ум  - " + ravenclaw1.getSmart() + " баллов.");
        System.out.println("У " + ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                " " + "ум  - " + ravenclaw2.getSmart() + " баллов.");
        System.out.println();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " " + "мудрость - " + ravenclaw1.getWise() + " баллов.");
        System.out.println("У " + ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                " " + "мудрость - " + ravenclaw2.getWise() + " баллов.");
        System.out.println();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " " + "креативность  - " + ravenclaw1.getCreativity() + " баллов.");
        System.out.println("У " + ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                " " + "креативность  - " + ravenclaw2.getCreativity() + " баллов.");
        System.out.println();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " " + "магическая сила  - " + ravenclaw1.getMagicPower() + " баллов.");
        System.out.println("У " + ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                " " + "магическая сила  - " + ravenclaw2.getMagicPower() + " баллов.");
        System.out.println();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " " + "трансгрессирование  - " + ravenclaw1.getTransgress() + " баллов.");
        System.out.println("У " + ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                " " + "трансгрессирование  - " + ravenclaw2.getTransgress() + " баллов.");
        System.out.println();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " " + "свойства характера  - " + ravenclaw1.getCharacterProperties() + " баллов.");
        System.out.println("У " + ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                " " + "свойства характера  - " + ravenclaw2.getCharacterProperties() + " баллов.");
        System.out.println();
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " общее количество баллов составило " + raven1Summ + " баллов.");
        System.out.println("У " + ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                " общее количество баллов составило " + raven2Summ + " баллов.");
        System.out.println();

        if (raven1Summ > raven2Summ) {
            System.out.println("И с результатом " + raven1Summ + " баллов побеждает "
                    + ravenclaw1.getName() + " " + ravenclaw1.getSurname());
        } else {
            System.out.println("И с результатом " + raven2Summ + " баллов побеждает "
                    + ravenclaw2.getName() + " " + ravenclaw2.getSurname());
        }
        separator();
    }

}
