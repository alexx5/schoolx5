package lesson5.task1;

public class Main {

    public static void main(String[] args) {

        Calc exampleCalc = new Calc();

        Factory exampleFactory = new Factory();
        Logger exampleDbLogger = exampleFactory.create("DbLogger");
        //exampleDbLogger.log("Random text Db");
        Logger exampleFileLogger = exampleFactory.create("FileLogger");
        //exampleFileLogger.log("Random text File");
        Logger exampleConsoleLogger = exampleFactory.create("ConsoleLogger");
        //exampleConsoleLogger.log("Random text Console");

        System.out.println(exampleCalc.multiply(2, 3));
        System.out.println(exampleCalc.split(2, 3));
        System.out.println(exampleCalc.subtract(2, 3));
        System.out.println(exampleCalc.fold(2, 3));
    }
}