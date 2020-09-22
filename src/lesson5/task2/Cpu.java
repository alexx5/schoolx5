package lesson5.task2;

public class Cpu {
    private int clockFrequency;
    private int numberCores;
    private int cacheMemory;
    private String name;
    private String manufacturer;

    public int getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(int clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    public int getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
