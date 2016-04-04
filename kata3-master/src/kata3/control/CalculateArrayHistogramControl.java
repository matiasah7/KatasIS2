package kata3.control;

import kata3.model.HistogramBuilder;
import kata3.ui.HistogramViewer;

public class CalculateArrayHistogramControl<T> {

    private Integer[] array;

    public CalculateArrayHistogramControl(Integer[] array) {
        this.array = array;
    }

    public void execute() {
        HistogramBuilder<Integer> builder = new HistogramBuilder();
        builder.calculate(array);
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
