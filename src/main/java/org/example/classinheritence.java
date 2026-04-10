package org.example;
import java.util.Scanner;

class A {
    void add(int x, int y) {
        System.out.println("Addition: " + (x + y));
    }
}

class B extends A {
    void sub(int x, int y) {
        System.out.println("Subtraction: " + (x - y));
    }
}

class C extends B {
    void mul(int x, int y) {
        System.out.println("Multiplication: " + (x * y));
    }
}

class D extends C {
    void div(int x, int y) {
        if (y != 0)
            System.out.println("Division: " + (x / y));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class classinheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1.Add  2.Sub  3.Mul  4.Div");
        int ch = sc.nextInt();

        D obj = new D();

        if (ch == 1) {
            obj.add(a, b);
        }
        else if (ch == 2) {
            obj.sub(a, b);
        }
        else if (ch == 3) {
            obj.mul(a, b);
        }
        else if (ch == 4) {
            obj.div(a, b);
        }
        else {
            System.out.println("Wrong choice");

        }

        sc.close();
    }
}