package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Griffindor harry = new Griffindor("Гарри", "Поттер", 60, 50, 100, 50, 95, 100);
        Griffindor ron = new Griffindor("Рон", "Уизли", 75, 89, 39, 98, 93, 85);
        Griffindor hermiona = new Griffindor("Гермиона", "Грейнджер", 70, 80, 65, 78, 68, 12);

        Slytherin drako = new Slytherin("Драко", "Малфой", 80, 65, 12, 45, 50, 90, 75);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 50, 25, 90, 50, 70, 80, 25);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 60, 45, 70, 90, 70, 20, 10);

        Ravenclaw chang = new Ravenclaw("Чжоу", "Чанг", 90, 80, 60, 80, 65, 50);
        Ravenclaw patil = new Ravenclaw("Падма", "Патил", 90, 80, 60, 80, 65, 50);
        Ravenclaw balbi = new Ravenclaw("Маркус", "Белби", 90, 80, 60, 80, 65, 50);

        Hufflepuff smith = new Hufflepuff("Захария", "Смит", 90, 85, 59, 63, 25, 80);
        Hufflepuff diggory = new Hufflepuff("Седрик", "Диггори", 80, 95, 72, 15, 90, 60);
        Hufflepuff fintch = new Hufflepuff("Джастин", "Финч-Флетчли", 78, 69, 90, 43, 79, 60);


        harry.getGrifStudentInfo();
        drako.getSlythStudentInfo();
        chang.getRavenStudentInfo();
        diggory.getHuffleStudentInfo();

    Griffindor.compareGrifStudents(harry,ron);
    Slytherin.compareSlythStudents(gregory,graham);
    Hufflepuff.compareHufflStudents(smith,fintch);
    Ravenclaw.compareRavenStudents(patil,balbi);
    Hogwarts.compareHogStudents(patil,harry);
    }

}
