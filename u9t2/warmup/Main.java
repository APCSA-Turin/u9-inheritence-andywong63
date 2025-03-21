package u9t2.warmup;

import u9t1.lab2.computer.*;

public class Main {
    public static void main(String[] args) {
        GamingDesktop gamingDesktop = new GamingDesktop(18, 16384, "AMD Radeon RX 7900 XTX", "24.6.1");
        System.out.println(gamingDesktop.getGpuDriverVersion());
        System.out.println(gamingDesktop.updateGpuDrivers("25.2.1"));
        System.out.println(gamingDesktop.getGpuDriverVersion());
        System.out.println(gamingDesktop.updateGpuDrivers("25.2.1"));
        System.out.println(gamingDesktop.getGpuDriverVersion());
        System.out.println();
        System.out.println(gamingDesktop instanceof Desktop);
        System.out.println(gamingDesktop instanceof Computer);
    }
}