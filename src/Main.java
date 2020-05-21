public class Main {
public static void main(String[]args){
    BmiService service = new BmiService();
    double weight = 94.4;
    double height = 1.80;
    double bmIndex = service.calculate(weight, height);
    System.out.println(bmIndex);
        }
}
