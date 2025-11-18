
import com.sun.source.tree.Tree;
import java.lang.reflect.Array;

public class PlayWithSmartphoneArrays {

    static Smartphone[] search(final Smartphone[] array, final String brand) {
        Smartphone[] brandSearch = new Smartphone[array.length];
        for(Smartphone smart : array){
            if (smart.getBrand().equals(brand)){
                for (int i = 0; i < brandSearch.length; i++) {
                    if (brandSearch[i] == null) {
                        brandSearch[i] = smart;
                        break;
                    }
                }
            }
        }
        return brandSearch;
    }

    static Smartphone[] search(final Smartphone[] array, final boolean hasNFC, final boolean hasGPS) {
        Smartphone[] NFCGPSSearch = new Smartphone[array.length];
        for(Smartphone smart : array){
            if (smart.getHasNFC() && smart.getHasGPS()){
                for (int i = 0; i < NFCGPSSearch.length; i++) {
                    if (NFCGPSSearch[i] == null) {
                        NFCGPSSearch[i] = smart;
                        break;
                    }
                }
            }
        }
        return NFCGPSSearch;
    }

    static Smartphone[] search(final Smartphone[] array, final int nCPUs, final int sdSize) {
        Smartphone[] CPUSDSearch = new Smartphone[array.length];
        for(Smartphone smart : array){
            if (smart.getNCPU() == nCPUs && smart.getSdSize() == sdSize){
                for (int i = 0; i < CPUSDSearch.length; i++) {
                    if (CPUSDSearch[i] == null) {
                        CPUSDSearch[i] = smart;
                        break;
                    }
                }
            }
        }
        return CPUSDSearch;    
    }

    static void printSmartsArray(final Smartphone[] array){
        for(Smartphone smart : array){
            if (smart != null) {
                smart.printStringRep();
                System.out.println("");
            }
        }
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare lo smarthpone HTC One ram:1024 sdSize
         * 
         * 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 sdSize:8192
         * gps:true nfc:true 3g:true
         * 
         * 3) Creare lo smarthpone iPhone 5S nfc:false
         * 
         * 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true
         * 
         * 5) Creare lo smarthpone Acer Liquid cpu:2 ram:512 sdSize:8192 gps:
         * true 3g:true nfc: false
         * 
         * 6) Eseuguire diverse operazioni di ricerca con i metodi search
         * implementati e controllare la corrispondenza del numero dei telefoni
         * facenti match
         */
        
        Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        
        Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        
        Smartphone iPhone5S = new Smartphone("Apple", "iPhone 5S", false);
        
        Smartphone nexus4 = new Smartphone("Google", "Nexus 4", true, true);
        
        Smartphone acerLiquid = new Smartphone(2, 512, 8192, "Acer", "Liquid", true, true, false);

        Smartphone[] smarts = new Smartphone[]{htcOne, note3, iPhone5S, nexus4, acerLiquid};
        /*
        htcOne.printStringRep();
        note3.printStringRep();
        iPhone5S.printStringRep();
        nexus4.printStringRep();
        acerLiquid.printStringRep();
         * 
         * 
         */

        //PlayWithSmartphoneArrays.printSmartsArray(PlayWithSmartphoneArrays.search(smarts, "HTC"));
        //PlayWithSmartphoneArrays.printSmartsArray(PlayWithSmartphoneArrays.search(smarts, true, true));
        PlayWithSmartphoneArrays.printSmartsArray(PlayWithSmartphoneArrays.search(smarts, 2,8192));
        
    }
}
