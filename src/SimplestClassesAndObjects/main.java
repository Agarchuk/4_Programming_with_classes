package SimplestClassesAndObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
// test1
//        Test1 test = new Test1(14, 12);
//        System.out.println(test.summ());
//        System.out.println(test.max());
// student
//        Student[] students = new Student[] {
//                new Student("Гарчук", "А.А.", 8930, new int[] {9, 9, 8 ,10 ,10} ),
//                new Student("Иванов", "М.П.", 6408, new int[]{7,7,7,7,7}),
//                new Student("Сидоров", "А.Д.", 8402, new int[]{8,8,8,8,8}),
//                new Student("Ульянов", "А.Д.", 8402, new int[]{9,9,9,9,9}),
//                new Student("Второв", "А.Д.", 8402, new int[]{6,6,6,6,6}),
//                new Student("Соколов", "А.Д.", 8402, new int[]{9,9,7,9,9}),
//                new Student("Шурдуков", "А.Д.", 8402, new int[]{9,9,9,8,9}),
//                new Student("Когдаков", "А.Д.", 8402, new int[]{9,6,9,9,9}),
//                new Student("Зубарев", "А.Д.", 8402, new int[]{9,10,9,10,9}),
//                new Student("Филатов", "А.Д.", 8402, new int[]{10,10,10,10,10})
//        };
//        listOfStudentWithGoodMarks(students);
//    }
//    public static void listOfStudentWithGoodMarks(Student[] students){
//        System.out.println("Список студентов с отличными оценками: ");
//        for (int i =0; i<students.length; i++){
//            int count =0;
//            for (int j = 0; j<students[i].assesment.length; j++){
//                if (students[i].assesment[j]>=9){
//                    count ++;
//                }
//            }
//            if(count == students[i].assesment.length){
//                System.out.println(students[i]);
//            }
//        }
// Train
//        Train[] trains = new Train[]{
//            new Train("Санкт-Петербург", 154, 17, 48),
//                new Train("Санкт-Петербург", 104, 7, 44),
//                new Train("Москва", 37, 13, 13),
//                new Train("Санкт-Петербург", 44, 7, 18),
//                new Train("Брест", 133, 10, 40)
//        };
//        //info(trains);
//        sortByDestination(trains);
//
//    }
//    public static void sortByDestination(Train[] trains){
//        for (int i = 0; i<trains.length; i++){
//            for (int j = trains.length-1; j>i; j--){
//                int compare = trains[j].destination.compareTo(trains[j-1].destination);
//                if (compare <0){
//                    Train tmp = trains[j];
//                    trains[j] = trains[j-1];
//                    trains[j-1] = tmp;
//                } else if( compare==0){
//                    if(trains[j].hours<trains[j-1].hours){
//                        Train tmp = trains[j];
//                        trains[j] = trains[j-1];
//                        trains[j-1] = tmp;
//                    } else if (trains[j].hours==trains[j-1].hours){
//                        if(trains[j].minutes<trains[j-1].minutes){
//                            Train tmp = trains[j];
//                            trains[j] = trains[j-1];
//                            trains[j-1] = tmp;
//                        }
//                    }
//                }
//            }
//        }
//        for (int i = 0; i<trains.length; i++){
//            System.out.println(trains[i]);
//        }
//    }
//    public static void sortByNumber(Train[] trains){
//        for (int i = 0; i<trains.length; i++){
//            for (int j = trains.length-1; j>i; j--){
//                if (trains[j].numberOfTrain<trains[j-1].numberOfTrain){
//                    Train tmp = trains[j];
//                    trains[j] = trains[j-1];
//                    trains[j-1] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i<trains.length; i++){
//            System.out.println(trains[i]);
//        }
//    }
//    public static void info(Train[] trains){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите номер поезда: ");
//        int number = in.nextInt();
//        for (int i =0; i<trains.length; i++){
//            if(trains[i].numberOfTrain==number){
//                System.out.println(trains[i]);
//            }
//        }
//Counter
//        Counter counter = new Counter();
//
//        counter.increase();
//        //counter.decrease();
//        System.out.println(counter.current());
//        Counter counter1 = new Counter(12);
//        counter1.increase();
//        System.out.println(counter1.current());
//TIME
//        Time time = new Time(64, 35, 25);
//        System.out.println(time);
//        time.changeHour(1);
//        System.out.println(time);
// TRIANGLE
//    Triangle triangle = new Triangle(new double[]{9, 0},new double[]{3,3}, new double[]{2,2});
//        System.out.println("Периметр: "+triangle.perimetr());
//        System.out.println("Площадь: "+triangle.suqare());
//        triangle.centr();
            Scanner in = new Scanner(System.in);
            System.out.print("Number of paragraph: ");
            int n = in.nextInt();
            String tmp = in.nextLine();
            System.out.print("Enter text:");

            String text = in.nextLine();
            System.out.println(text);
            do
            {
                text = text.concat(in.nextLine());
                n--;
            }
            while (n > 0);

        System.out.println(text);
            in.close();

    }


}
