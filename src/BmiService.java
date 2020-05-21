public class BmiService {
    public double calculate (double weight, double height){
        double bmIndex =  (int) weight / (height * height);
        return (bmIndex);
    }
}
