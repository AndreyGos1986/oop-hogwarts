package ru.skypro;

public class Hogwarts {

    private String name;
    private String surname;
    private int characterProperties;
    private int magicPower;
    private int transgress;

    public Hogwarts(String name, String surname, int characterProperties, int magicPower, int transgress) {
        this.name = name;
        this.surname = surname;
        this.characterProperties = characterProperties;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCharacterProperties() {
        return characterProperties;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public static void separator() {
        System.out.println("=============================================================================================================================================================================");
    }

    public static void compareHogStudents(Hogwarts hogwarts1, Hogwarts hogwarts2) {

        int hog1Summ = hogwarts1.getTransgress() + hogwarts1.getMagicPower() + hogwarts1.getCharacterProperties();
        int hog2Summ = hogwarts2.getTransgress() + hogwarts2.getMagicPower() + hogwarts2.getCharacterProperties();

        System.out.println("ПОБЕДИТЕЛЬ МЕЖДУ ФАКУЛЬТЕТАМИ ХОГВАРТС");
        System.out.println("У " + hogwarts1.getName() + " " + hogwarts1.getSurname() +
                " " + "магическая сила  - " + hogwarts1.getMagicPower() + " баллов.");
        System.out.println("У " + hogwarts2.getName() + " " + hogwarts2.getSurname() +
                " " + "магическая сила  - " + hogwarts2.getMagicPower() + " баллов.");
        System.out.println();

        System.out.println("У " + hogwarts1.getName() + " " + hogwarts1.getSurname() +
                " " + "свойства характера  - " + hogwarts1.getCharacterProperties() + " баллов.");
        System.out.println("У " + hogwarts2.getName() + " " + hogwarts2.getSurname() +
                " " + "свойства характера  - " + hogwarts2.getCharacterProperties() + " баллов.");
        System.out.println();
        System.out.println("У " + hogwarts1.getName() + " " + hogwarts1.getSurname() +
                " " + "трансгрессирование  - " + hogwarts1.getTransgress() + " баллов.");
        System.out.println("У " + hogwarts2.getName() + " " + hogwarts2.getSurname() +
                " " + "трансгрессирование  - " + hogwarts2.getTransgress() + " баллов.");
        System.out.println();

        System.out.println("У " + hogwarts1.getName() + " " + hogwarts1.getSurname() +
                " общее количество баллов составило " + hog1Summ + " баллов.");
        System.out.println("У " + hogwarts2.getName() + " " + hogwarts2.getSurname() +
                " общее количество баллов составило " + hog2Summ + " баллов.");
        System.out.println();

        if (hog1Summ > hog2Summ) {
            System.out.println("И с результатом " + hog1Summ + " баллов побеждает "
                    + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println("И с результатом " + hog2Summ + " баллов побеждает "
                    + hogwarts2.getName() + " " + hogwarts2.getSurname());
        }
        separator();
    }

}
