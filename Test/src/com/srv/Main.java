package com.srv;

/*
class Calculator {

    int a; // specify what obj knows

    //what ohj does
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
*/

class Computer {

    /*
     * we are creating a behaviour of a the class say play music
     * public - defines what kind of access are giving - here public : anywhere
     * void - since we aren't returning anything
     */
    public void playmusic() {
        System.out.println("music playing");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "pen";
        return "nothing";
    }
}

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        /*
         * int num1 = 4;
         * int num2 = 5;
         * 
         * // how to use the Calculator class : to create a obj of it
         * // asking JVM i need to create new obj JVM does with new keyword
         * Calculator calc = new Calculator();
         * int result = calc.add(num1, num2);
         * System.out.println(result);
         */
        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getMeAPen(1);
        System.out.println(str);
    }
}

// till : https://youtu.be/BGTx91t8q50?t=12570
