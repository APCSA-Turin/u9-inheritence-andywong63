package u9t1.freestyle;

public class Phone extends Device {
    private String imeiNum;

    public Phone(String name, String architecture, int storage, String imeiNum) {
        super(name, architecture, storage);
        this.imeiNum = imeiNum;
    }

    public String getImeiNum() {
        return imeiNum;
    }

    public void call(Phone phone) {
        System.out.println("Phone with IMEI " + imeiNum + " is calling " + phone.imeiNum);
    }
}