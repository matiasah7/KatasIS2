package kata3;

import kata3.control.CalculateArrayHistogramControl;
import kata3.control.CalculateEmailDomainHistogramControl;

public class Kata3 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 1, 1, 3, 2, 1, 3, 6};
        CalculateArrayHistogramControl<Integer> control = new CalculateArrayHistogramControl(array);
        control.execute();
        
        String filename = "C:\\Users\\matiasah7\\Documents\\NetBeansProjects\\Kata3\\Correos.txt";
        CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
        control2.execute();
    }
}
