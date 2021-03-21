package com.company;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "suzuki"));
        cars.add(new Car(2, "lamborgini"));
        cars.add(new Car(3, "ferrai"));

        for (Car c : cars) {
            System.out.println(c);
        }

        printCars(cars);
        System.out.println("========================");
        System.out.println("Which car index to delete?");
        Scanner s = new Scanner(System.in);
        int car_index = s.nextInt();
        cars.remove(car_index);
        printCars(cars);

        //why not working remove ?
        for (Car c : cars) {
            cars.remove(c);
        }


        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set1.add(3);
        for (Integer number : set1) {
            System.out.println(number);
        }

        Set<String> set2 = new HashSet<>();
        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("a");
        for (String string:set2) {
            System.out.println(string);
        }

        Stack<Integer> numbersStack = new Stack<>();
        numbersStack.push(12);
        numbersStack.push(10);
        numbersStack.push(-3);
        numbersStack.push(0);
        numbersStack.stream().forEach(System.out::println);
        System.out.println("-----------------");
        Integer item = numbersStack.pop();
        System.out.println(item);
        System.out.println(numbersStack.peek());
        // targil 2:

        Stack<Integer> numberss = new Stack<>();
        numberss.push(4);
        numberss.push(-12);
        numberss.push(20);
        numberss.push(30);
        numberss.push(0);
        numberss.push(-2);
        numberss.push(200);
        //להעביר למחסנית אחרת ושרק חיוביים יהיו בה
        Stack<Integer> numbersbenaim = new Stack<>();
        Stack<Integer> numberspitaron = new Stack<>();
        while (!numberss.empty()) {
            //are you empty stack? if not then lets keep take out the...
            Integer stack_item = numberss.pop(); //מושך איבר מהמחסנית
            if (stack_item > 0) { //אם גדול מ-0
                numbersbenaim.push(stack_item); //מכניס למחסנית ביניים
            }
        }
            while (!numbersbenaim.empty()){
                Integer stuck_item = numbersbenaim.pop();
                numberspitaron.push(stuck_item);
            }
        }


    public static void printCars(ArrayList<Car> cars) {
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
