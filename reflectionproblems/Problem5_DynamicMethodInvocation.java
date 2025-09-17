package reflectionproblems;

import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class Problem5_DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter method name (add, subtract, multiply): ");
        String methodName = sc.nextLine();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(new MathOperations(), 10, 5);
        System.out.println("Result: " + result);
        sc.close();
    }
}