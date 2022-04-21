package ru.skypro;

public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname,
                      int hardworking, int loyal, int honest,
                      int characterProperties, int magicPower, int transgress) {
        super(name, surname, characterProperties, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }


    public void getHuffleStudentInfo() {
        System.out.println(getName() + " " + getSurname() + ": ");
        System.out.println("Очки трудолюбия: " + getHardworking() + " " +
                "очки послушания: " + getLoyal() + " " +
                "очки честности: " + getHonest() + " " +
                "очки свойства характера: " + super.getCharacterProperties() + " " +
                "очки магической силы: " + super.getMagicPower() + " " +
                "дальность трансгрессирования: " + super.getTransgress());
        separator();
    }

    public static void compareHufflStudents(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int huffle1Summ = hufflepuff1.getHardworking() + hufflepuff1.getLoyal() + hufflepuff1.getHonest() +
                hufflepuff1.getTransgress() + hufflepuff1.getMagicPower() + hufflepuff1.getCharacterProperties();

        int huffle2Summ = hufflepuff2.getHardworking() + hufflepuff2.getLoyal() + hufflepuff2.getHonest() +
                hufflepuff2.getTransgress() + hufflepuff2.getMagicPower() + hufflepuff2.getCharacterProperties();

        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " " + "трудолюбиe  - " + hufflepuff1.getHardworking() + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " " + "трудолюбиe  - " + hufflepuff2.getHardworking() + " баллов.");
        System.out.println();
        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " " + "послушание - " + hufflepuff1.getLoyal() + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " " + "послушание - " + hufflepuff2.getLoyal() + " баллов.");
        System.out.println();
        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " " + "честность  - " + hufflepuff1.getHonest() + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " " + "честность  - " + hufflepuff2.getHonest() + " баллов.");
        System.out.println();
        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " " + "магическая сила  - " + hufflepuff1.getMagicPower() + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " " + "магическая сила  - " + hufflepuff2.getMagicPower() + " баллов.");
        System.out.println();
        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " " + "трансгрессирование  - " + hufflepuff1.getTransgress() + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " " + "трансгрессирование  - " + hufflepuff2.getTransgress() + " баллов.");
        System.out.println();
        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " " + "свойства характера  - " + hufflepuff1.getCharacterProperties() + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " " + "свойства характера  - " + hufflepuff2.getCharacterProperties() + " баллов.");
        System.out.println();
        System.out.println("У " + hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                " общее количество баллов составило " + huffle1Summ + " баллов.");
        System.out.println("У " + hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                " общее количество баллов составило " + huffle2Summ + " баллов.");
        System.out.println();

        if (huffle1Summ > huffle2Summ) {
            System.out.println("И с результатом " + huffle1Summ + " баллов побеждает "
                    + hufflepuff1.getName() + " " + hufflepuff1.getSurname());
        } else {
            System.out.println("И с результатом " + huffle2Summ + " баллов побеждает "
                    + hufflepuff2.getName() + " " + hufflepuff2.getSurname());
        }
        separator();
    }

}


