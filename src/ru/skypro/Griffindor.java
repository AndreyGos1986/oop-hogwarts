package ru.skypro;

public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int nobility, int honor, int bravery,
                      int characterProperties, int magicPower, int transgress) {
        super(name, surname, characterProperties, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void getGrifStudentInfo() {
        System.out.println(getName() + " " + getSurname() + ": ");
        System.out.println("Очки благородства: " + getNobility() + " " +
                "очки чести: " + getHonor() + " " +
                "очки храбрости: " + getBravery() + " " +
                "очки свойства характера: " + super.getCharacterProperties() + " " +
                "очки магической силы: " + super.getMagicPower() + " " +
                "дальность трансгрессирования: " + super.getTransgress());
        separator();
    }

    public static void compareGrifStudents(Griffindor griffindor1, Griffindor griffindor2) {
        int grif1Summ = griffindor1.getHonor() + griffindor1.getNobility() + griffindor1.getBravery() +
                griffindor1.getTransgress() + griffindor1.getMagicPower() + griffindor1.getCharacterProperties();
        int grif2Summ = griffindor2.getHonor() + griffindor2.getNobility() + griffindor2.getBravery() +
                griffindor2.getTransgress() + griffindor2.getMagicPower() + griffindor2.getCharacterProperties();
        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " " + "благородство  - " + griffindor1.getNobility() + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " " + "благородство  - " + griffindor2.getNobility() + " баллов.");
        System.out.println();
        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " " + "честь - " + griffindor1.getHonor() + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " " + "честь - " + griffindor2.getHonor() + " баллов.");
        System.out.println();
        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " " + "храбрость  - " + griffindor1.getBravery() + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " " + "храбрость  - " + griffindor2.getBravery() + " баллов.");
        System.out.println();


        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " " + "магическая сила  - " + griffindor1.getMagicPower() + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " " + "магическая сила  - " + griffindor2.getMagicPower() + " баллов.");
        System.out.println();
        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " " + "трансгрессирование  - " + griffindor1.getTransgress() + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " " + "трансгрессирование  - " + griffindor2.getTransgress() + " баллов.");
        System.out.println();
        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " " + "свойства характера  - " + griffindor1.getCharacterProperties() + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " " + "свойства характера  - " + griffindor2.getCharacterProperties() + " баллов.");
        System.out.println();
        System.out.println("У " + griffindor1.getName() + " " + griffindor1.getSurname() +
                " общее количество баллов составило " + grif1Summ + " баллов.");
        System.out.println("У " + griffindor2.getName() + " " + griffindor2.getSurname() +
                " общее количество баллов составило " + grif2Summ + " баллов.");
        System.out.println();

        if (grif1Summ > grif2Summ) {
            System.out.println("И с результатом " + grif1Summ + " баллов побеждает "
                    + griffindor1.getName() + " " + griffindor1.getSurname());
        } else {
            System.out.println("И с результатом " + grif2Summ + " баллов побеждает "
                    + griffindor2.getName() + " " + griffindor2.getSurname());
        }
        separator();
    }

}

