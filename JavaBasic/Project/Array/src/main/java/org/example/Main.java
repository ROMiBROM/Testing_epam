package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //массивы
        int[] array1 = new int[]{1, 2, 3, 5, 6};
        int array2[] = new int[5];
        System.arraycopy(array1, 1, array2, 0, array1.length - 2);
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 0) {
                continue;
            }
            System.out.println(array2[i]);
        }
        System.out.println("Array1");
        for (int i : array1) {

            System.out.println(i);
        }
        System.out.println("Двумерный массив");
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
        Car car1 = new Car("Mercedes", 2245);
        car1.displayInfo();
        HeavyCar pikap = new HeavyCar("Chevrollete", 4567);
        pikap.displayInfo();
        //Строки
        StringBuilder builder = new StringBuilder();
        builder.append("Romixxx");
        System.out.println(builder.capacity());
        System.out.println(builder);


        //исключение
        try {
            System.out.println(array1[100]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Point<Double> pt = new Point<>();
        Point<Integer> pd = new Point<>();
        Point<Byte> pv = new Point<>();
        pt.x=2.1;
        pt.y=2.1;
        System.out.println(pt.x + " "+pt.y);
        pd.y=1;
        pd.x=2;
        System.out.println(pd.x +" "+pd.y);
        pv.y=1;
        pv.x=0;
        System.out.println(pv.x +" "+pv.y);

        Days days = Days.Tuesday;
        System.out.println(days);
        Days day = Days.Friday;
        System.out.println(day);
        Days day3 = Days.Thursday;
        System.out.println(day3);
        Days day5 = Days.Wednesday;
        System.out.println(day5);

        Integer x = new Integer(100);
        System.out.println(x.getClass());

    }
    public static class Car
    {
        String Mark;
        int number;

        String type;

        //construct
        Car(String mark, int num) {
            this.Mark=mark;
            this.number =num;
        }
        void displayInfo(){
            System.out.printf("Mark: %s \tNumber: %d\t \n", Mark, number);
        }
    }
    public static class HeavyCar extends Car
    {
        HeavyCar(String mark, int num)
        {
            super(mark, num);
        }
        @Override
        void displayInfo(){
            super.type="Heavy";
            super.displayInfo();
            System.out.printf("Type: %s \n", super.type);
        }
    }
    static class Point<T>
    {
        public T x,y;
    }
    enum Days
    {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday ,
        Saturday,
        Sunday;
    }
}