package lesson5.task1;

public class Calc {

    /*
    Factory exampleFactory = new Factory();
    Logger exampleDbLogger = exampleFactory.create("DbLogger");
    Logger exampleFileLogger = exampleFactory.create("FileLogger");
    Logger exampleConsoleLogger = exampleFactory.create("ConsoleLogger");
     */

    public float multiply(float num1, float num2) {
        return num1 * num2;
        /*
        float result = num1 * num2;
        System.out.println(result);
        exampleDbLogger.log(String.valueOf(result));
        exampleFileLogger.log(String.valueOf(result));
        exampleConsoleLogger.log(String.valueOf(result));
         */
    }

    public float split(float num1, float num2) {
        return num1 / num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float fold(float num1, float num2) {
        return num1 + num2;
    }
}