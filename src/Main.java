public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание №1 ");
        for (int i = 1; i <= 10; i++) {
            System.out.println( i);
        }
        System.out.println(" Задание №2 ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println(" Задание №3 ");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(" Четные числа  " + i);
        }
        System.out.println(" Задание №4 ");
        for (int i = 10; i >= -10; i--) {
            System.out.println(  i);
        }
        System.out.println(" Задание №5 ");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год високосный ");
        }
        System.out.println(" Задание №6 ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println(" Задание №7 ");
        for ( int i = 1; i<= 512; i = i*2){
            System.out.println( i );
        }
        System.out.println(" Задание №8 ");
        System.out.println();
        int salaryR = 29_000;
        int total1 = 0;
        for (int i = 1; i <=12; i++) {
            total1 =total1 + salaryR;
            System.out.println(" Месяц " +i+ ", сумма накоплений равна  "+total1 +" рублей ");
        }
        System.out.println(" Задание №9 ");
        for (int i = 1; i <=12; i++) {
            total1= total1  + total1/100;
            total1 =total1 + salaryR;
            System.out.println(" Месяц " +i+ ", сумма накоплений равна  "+total1 +" рублей ");
        }
        System.out.println();
        System.out.println(" Спасибо за такое интересное домашнее задание " );

    }
}