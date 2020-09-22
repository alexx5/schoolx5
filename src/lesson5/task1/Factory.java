package lesson5.task1;

public class Factory {
    public Logger create(String typeOfLogger) {
        switch (typeOfLogger) {
            case "ConsoleLogger":
                return new ConsoleLogger();
            case "FileLogger":
                return new FileLogger();
            case "DbLogger":
                return new DbLogger();
            default:
                return null;
        }
    }
}