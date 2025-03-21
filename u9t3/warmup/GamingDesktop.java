package u9t3.warmup;

import u9t1.lab2.computer.Desktop;

public class GamingDesktop extends Desktop {
    private String gpu;
    private String gpuDriverVersion;

    public GamingDesktop(int screenSize, int memory, String gpu, String gpuDriverVersion) {
        super(screenSize, memory, true);
        this.gpu = gpu;
        this.gpuDriverVersion = gpuDriverVersion;
    }

    public String getGpu() {
        return gpu;
    }
    public String getGpuDriverVersion() {
        return gpuDriverVersion;
    }

    public boolean updateGpuDrivers(String newVersion) {
        if (gpuDriverVersion.equals(newVersion)) {
            return false; // Version already installed
        }
        gpuDriverVersion = newVersion;
        return true;
    }
}