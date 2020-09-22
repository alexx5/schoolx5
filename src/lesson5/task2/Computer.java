package lesson5.task2;

public class Computer {
    private Cpu cpu;
    private GraphicsCard graphicsCard;
    private Monitor monitor;
    private Ram ram;
    private StorageDevice storageDevice;

    public Computer() {
        this.cpu = new Cpu();
        this.graphicsCard = new GraphicsCard();
        this.monitor = new Monitor();
        this.ram = new Ram();
        this.storageDevice = new StorageDevice();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }
}