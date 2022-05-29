public class BmiService {

    public double calculate(double weight, double height) {
        int degree = 2;
        double formula;
        formula = weight / Math.pow(height, degree);  // Math.pow(что возводим, степень)

        return formula;
    }
}
