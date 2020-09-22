package lesson5.task2;

public class GraphicsCard {
    private String manufacturer;
    private int memory;
    private String memoryType;
    private boolean activeCooling;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public boolean isActiveCooling() {
        return activeCooling;
    }

    public void setActiveCooling(boolean activeCooling) {
        this.activeCooling = activeCooling;
    }
}
