public class Main {
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();




    }

    public static void zadanie1(){
        Sotrudnik sotrudnik1 = new Sotrudnik("Иванов Иван Иванович","Заведующий отделением","flee@gmail.com",79239456593L,85043.45,23);
        sotrudnik1.printInfo();
    }

    public static void zadanie2(){
        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Иванов Иван", "QA Engineer",
                "ivivan@mailbox.com", 89231231223L, 30000.40, 30);
        persArray[1] = new Sotrudnik("Дмитриев Дмитрий", "Сварщик",
                "29392@mailbox.com", 89233993933L, 20000.40, 20);
        persArray[2] = new Sotrudnik("Сидоров Петр", "Ветеринар",
                "SidorovP@mailbox.com", 89234934933L, 43000.40, 30);
        persArray[3] = new Sotrudnik("Петров Сергей", "Программист",
                "petrovFff@mailbox.com", 89231231223L, 54000.40, 30);
        persArray[4] = new Sotrudnik("Кухар Илья", "Технолог",
                "iKukhn@mailbox.com", 89231231223L, 30000.40, 30);
    }

    public static void zadanie3(){
        Park.Attraction attraction1 = new Park().new Attraction();
        attraction1.attractionName = "Ракушки";
        attraction1.workTime = "9:00-17:00";
        attraction1.cost = 30.30;
        Park.Attraction attraction2 = new Park().new Attraction();
        attraction2.attractionName = "Карусель";
        attraction2.workTime = "9:00-16:00";
        attraction2.cost = 40.30;
        System.out.println(attraction1.attractionName);
        System.out.println(attraction1.workTime);
        System.out.println(attraction1.cost);
        System.out.println(attraction2.attractionName);
        System.out.println(attraction2.workTime);
        System.out.println(attraction2.cost);


    }

    }


