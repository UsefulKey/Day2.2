public class Main {
    public static void main(String[] args) throws InterruptedException{

        Phone User1=new Phone("+7777443562","Poco X3","Xiomi","Ферденант","201","5000", "Android", "160000", "Snapdragon 730", "Отлично", "5.5", "2019","128","6");

        Phone User2=new Phone("+7073334553","12 Pro ","Apple","Алиса","170","3200", "Ios", "476000", "А14 bionic", "Отлично", "5.1", "2020","256","4");

        Phone User3=new Phone("87777350011","V20","Vivo","Глеб","150","3000", "Android", "90000", "Mediatek 700", "Хорошо", "4.4", "2022","64","4");

        Phone User4=new Phone("+77477774747","Galaxy Z flip","Samsung","Андрей","220","4000", "Android", "500000", "snapdragon 885", "Средне", "5.0", "2023","128","12");

        Phone User5=new Phone("+70723153234","P50 Pro","Huawei","Константин","195","5000", "Harmony OS 2.0", "500000", "snapdragon 888", "Отлично", "6.6", "2022","256","8");

        User4.setModel("S23 Ultra");
        User1.setNumber("+74771236734");
        User2.setOwnerName("Даник");
        User3.setBrand("Unknown");

        System.out.println("Телефон человека №1 ");
        System.out.println(User1.getNumber()+"\n"+User1.getBrand()+"\n"+User1.getModel() +"\n" +User1.getOwnerName());
        System.out.println(" ");
        System.out.println("Телефон человека №2");
        System.out.println(User2.getNumber()+"\n"+User2.getBrand()+"\n"+User2.getModel() +"\n" +User2.getOwnerName());
        System.out.println("");
        System.out.println("Телефон человека №3");
        System.out.println(User3.getNumber()+"\n"+User3.getBrand()+"\n"+User3.getModel() +"\n" +User3.getOwnerName());
        System.out.println(" ");
        System.out.println("Телефон человека №4");
        System.out.println(User4.getNumber()+"\n"+User4.getBrand()+"\n"+User4.getModel() +"\n" +User4.getOwnerName());
        System.out.println("");
        System.out.println("Телефон человека №5");
        System.out.println(User5.getNumber()+"\n"+User5.getBrand()+"\n"+User5.getModel() +"\n" +User5.getOwnerName());

    }
}