public class Smartphone {

    private static final boolean DEF_HAS_GPS = true;
    private static final boolean DEF_HAS_3G = true;
    private static final boolean DEF_HAS_NFC = true;
    private static final int DEF_SD_SIZE = 8192;
    private static final int DEF_RAM_SIZE = 1024;
    private static final int DEF_N_CPU = 2;

    public int nCPU;
    public int ram;
    public int sdSize;
    public String brand;
    public String model;
    public boolean hasGPS;
    public boolean has3G;
    public boolean hasNFC;

    public Smartphone(final int nCPU, final int ram, final int sdSize, final String brand, final String model, final boolean hasGPS, final boolean has3G, final boolean hasNFC) {
        this.nCPU = nCPU;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    public Smartphone(final String brand, final String model) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public void printStringRep() {
        System.out.println("n CPU(s): " + nCPU);
        System.out.println("RAM amount: " + ram);
        System.out.println("SD size: " + sdSize);
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("hasGPS: " + hasGPS);
        System.out.println("has3G: " + has3G);
        System.out.println("hasNFC: " + hasNFC + "\n");
    }

    public int getNCPU(){
        return nCPU;
    }

    public int getRam(){
        return ram;
    }

    public int getSdSize(){
        return sdSize;
    }

    public String getBrand(){
        return brand;    
    }
    
    public String getModel(){
        return model;
    }

    public boolean getHasGPS(){
        return hasGPS;
    }

    public boolean getHas3G(){
        return has3G;
    }

    public boolean getHasNFC(){
        return hasNFC;
    }
}
