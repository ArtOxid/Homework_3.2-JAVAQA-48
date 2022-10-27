public class BmiService {
    public int index(int weight, double hight) {
        double index = weight / (hight * hight);
        return (int) index;
    }
}
