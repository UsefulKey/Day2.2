public class Phone {

    private String number;
    private String model;
    private String brand;
    private String ownerName;
    private String weight;
    private String battery;
    private String os;
    private String price;
    private String cpu;
    private String connection_quality;
    private String size_screen;
    private String year;
    private String memory;
    private String ram_memory;




    public void recieveCall(String name) {
        System.out.println("На ваш телефон звонят " + name);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setConnection_quality(String connection_quality) {
        this.connection_quality = connection_quality;
    }

    public void setSize_screen(String size_screen){
        this.size_screen = size_screen;
    }

    public void setYear(String year){
        this.year = year ;
    }

    public void setMemory(String memory){
        this.memory = memory ;
    }

    public void setRam_memory(String ram_memory){
        this.ram_memory = ram_memory ;
    }



    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getWeight() {
        return weight;
    }

    public String getBattery() {
        return battery;
    }

    public String getOs() {
        return os;
    }

    public String getPrice() {
        return price;
    }

    public String getCpu() {
        return cpu;
    }

    public String getConnection_quality () {
        return  connection_quality;
    }

    public String getSize_screen() {
        return size_screen;
    }

    public String getYear(){
        return year;
    }

    public String getMemory() {
        return memory;
    }

    public String getRam_memory() {
        return ram_memory;
    }

    public int getIntx() {
        return intx;
    }

    private int intx = 0;

    public Phone(String number, String ownerName, String model, String weight) {
        this.number = number;
        this.ownerName = ownerName;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
    }

    public Phone(String number, String model,
                 String brand, String ownerName,
                 String weight, String battery,
                 String os , String price,
                 String cpu, String connection_quality,
                 String size_screen, String year,
                 String memory, String ram_memory) {

        this.number = number;
        this.model = model;
        this.brand = brand;
        this.ownerName = ownerName;
        this.weight = weight;
        this.battery = battery;
        this.os = os;
        this.price = price;
        this.cpu = cpu;
        this.connection_quality = connection_quality;
        this.size_screen = size_screen;
        this.year = year;
        this.memory = memory;
        this.ram_memory = ram_memory;

    }
}