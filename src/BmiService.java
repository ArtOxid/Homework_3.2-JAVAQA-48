public class BmiService {
    public int index() {
        int weight = 70;
        double hight = 1.60;
        int index = (int) (weight / (hight * hight));
        return index;
    }
}
