package lesson5.task2;

public class StorageDevice {
    private String manufacturer;
    private int memory;
    private String formFactor;
    private boolean typeHdd;

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

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public boolean isTypeHdd() {
        return typeHdd;
    }

    public void setTypeHdd(boolean typeHdd) {
        this.typeHdd = typeHdd;
    }
}
