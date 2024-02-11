package BuilderDesignPattern;

// Computer class to be built
public class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private boolean hasBluetooth;
    private boolean hasWifi;

    // PRIVATE Constructor
    private Computer( String cpu, int ram, int storage, String gpu, boolean hasBluetooth, boolean hasWifi ) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.hasBluetooth = hasBluetooth;
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", gpu='" + gpu + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                ", hasWifi=" + hasWifi +
                '}';
    }

    public static class ComputerBuilder {
        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private boolean hasBluetooth;
        private boolean hasWifi;

        // Constructor for compulsory fields(cpu, ram, storage)
        public ComputerBuilder( String cpu, int ram, int storage ) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // Setters for the Optional parameters(gpu, hasBluetooth, hasWifi)
        public ComputerBuilder withGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder withBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder withWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Computer build() {
            return new Computer( cpu, ram, storage, gpu, hasBluetooth, hasWifi );
        }
    }
}
