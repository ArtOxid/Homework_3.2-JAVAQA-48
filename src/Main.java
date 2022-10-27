public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        double hight = 1.60;
        int index = service.index(weight, hight);
        System.out.println(index);
    }
}