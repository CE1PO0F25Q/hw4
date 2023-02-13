public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();




    }
    public static void task1 () {

        System.out.println(" задача 1");
        byte b = 50;
        short s = 2000;
        int i = 21000;
        long l = 9223303;
        float f = 3.4000f;
        double d = 1.7000;
        System.out.println(" значение переменной b c  типом byte равно " + b);
        System.out.println(" значение переменной s с типом short равно " + s);
        System.out.println(" значение переменной i  с типом int равно " + i);
        System.out.println(" значение переменной l с типом long равно " + l);
        System.out.println(" значение переменной f с типом float равно " + f);
        System.out.println(" значение переменной  d  с типом double равно " + d);
    }

    public static void task2 () {
        System.out.println(" задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        float fl = 2.786f;
        short s = 569;
        short sh = -159;
        int i = 27897;
        byte b = 67;
    }
    public static void task3 () {
        System.out.println(" задача 3");
        byte pavlovna = 23;
        byte sergeevna = 27;
        byte andreevna = 30;
        int totalSheets = 480;
        int allStudents = pavlovna + sergeevna + andreevna;
        int oneStudent = totalSheets / allStudents;
        System.out.println("  на каждого ученика расчитано " + oneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println(" задача 4");
        byte twoMinutes = 16;
        byte minute = 2;
        int oneMinute = twoMinutes / minute;
        int twenty = twoMinutes * oneMinute;
        byte twentyMinute = 20;
        short day = 1440;
        short threeDays = 4320;
        int month = 43200;
        int day2 = day * oneMinute;
        int threeDays2 = oneMinute * threeDays;
        int Month1 = oneMinute * month;
        System.out.println(" за " + twentyMinute + " минут , машина произвела " + twenty + " штук бутылок");
        System.out.println(" за " + day + "  минут , машина произвела " + day2 + " штук бутылок ");
        System.out.println(" за " + threeDays + " минут , машина произвела " + threeDays2 + " штук бутылок ");
        System.out.println(" за " +  month + " минут , машина произвела " + Month1 + " штук бутылок" );
    }

    public static void task5 () {
        System.out.println(" задача 5");
        byte cans = 120;
        byte white = 2;
        byte brown = 4;
        int perClass = white + brown;
        int classes = cans / perClass;
        int dyeWhite = classes * white;
        int dyeBrown = classes * brown;
        System.out.println(" в школе где " + classes + " классов , нужно " + dyeWhite + " банок белой краски и " + dyeBrown + " банок коричневой краски ");
    }

    public static void task6() {
        System.out.println(" задача 6 ");
        byte bananas = 5;
        int milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCream2 = 100;
        byte eggsWeight = 70;
        int totalBananas = bananas * bananaWeight;
        int totalMilk = milkWeight + milkWeight;
        int totalCream = iceCream * iceCream2;
        int totalEggs = eggs * eggsWeight;
        System.out.println(" вес " + bananas + " бананов ," + totalBananas + " гр.");
        System.out.println(" всего молока " + totalMilk + " гр. ");
        System.out.println(" вес " + iceCream + " -х брикетов мороженного " + totalCream + " гр.");
        System.out.println(" всего яиц " + totalEggs + " гр. ");


        float кг = 0.001f;
        float b = totalBananas * кг;
        float m = totalMilk * кг;
        float i = totalCream * кг;
        float e = totalEggs * кг;
        System.out.println(" вес бананов " + b + " кг . ");
        System.out.println(" вес молока " + m + " кг . ");
        System.out.println(" вес мороженного " + i + " кг .");
        System.out.println(" вес яиц " + e + " кг .");
    }


    public static void task7 () {
        System.out.println(" задача 7 ");
        short weight = 7000;
        int day250 = 250;
        int day500 = 500;
        int averageValue = 2;
        int reset1 = weight / day250;
        int reset2 = weight / day500;
        int average = reset1 + reset2 / averageValue;
        System.out.println(" если теряет " + day250 + " гр . в день, то потребуется " + reset1 + " дней ");
        System.out.println(" если теряет " + day500 + " гр . в день, то потребуется " + reset2 + " дней ");
        System.out.println(" в среднем нужно " + average + " дней, что бы добиться результата ");
    }
    public static void task8 () {
        System.out.println(" задача 8 ");
        int Masha = 67760;
        int Den = 83690;
        int Kris = 76230;
        int percentM = Masha / 100 * 10;
        int percentD = Den / 100 * 10;
        int percentK = Kris / 100 * 10;
        int totalM = percentM + Masha;
        int totalD = percentD + Den;
        int totalK = percentK + Kris;

        int annualM = Masha * 12;
        int annualD = Den * 12;
        int annualK = Kris * 12;

        int annualMasha = totalM * 12;
        int annualDan = totalD * 12;
        int annualKris = totalK * 12;

        int differenceM = annualMasha - annualM;
        int differenceD = annualDan - annualD;
        int differenceK = annualKris - annualK;
        System.out.println(" Маша теперь получает " + totalM + "  рублей .Годовой доход вырос на " + differenceM + " рублей ");
        System.out.println(" Den теперь получает " + totalD + " рублей . Годовой доход вырос на " + differenceD + " рублей");
        System.out.println(" Kris теперь получает " + totalK + " рублей .Годовой доход вырос на " + differenceK + " рублей ");
    }






}










