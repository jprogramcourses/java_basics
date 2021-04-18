package JavaSEStreams;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Operations collect and reduce both perform reduction. However, collect operation accumulates results within intermediate containers, which may improve performance.
 * 
 * stream.collect(<supplier>, <accumulator>, <combiner>)
 * stream.collect(<collector>)
 * stream.collect(Collectors.collectingAndThen(<collector>, <finisher>)
 * 
 * Method collect accepts either a Collector implementation
 */
public class CollectExamples {

    public static void collectSummaryStaticsExample1() {

	DoubleSummaryStatistics doubleSummaryStatistics = getListDoubles().stream()
		.collect(Collectors.summarizingDouble(p -> p.doubleValue()));

	long count = doubleSummaryStatistics.getCount();
	double avg = doubleSummaryStatistics.getAverage();
	double min = doubleSummaryStatistics.getMin();
	double max = doubleSummaryStatistics.getMax();
	double sum = doubleSummaryStatistics.getSum();

	System.out.println("Resumen estadísticas: " + count + ", " + avg + ", " + min + ", " + max + ", " + sum);

    }

    private static List<Double> getListDoubles() {

	List<Double> listDoubles = new ArrayList<>();
	listDoubles.add(12.24);
	listDoubles.add(2.5);
	listDoubles.add(3.74);
	listDoubles.add(100.34);
	listDoubles.add(98.45);
	listDoubles.add(354.98);
	listDoubles.add(9.7);

	return listDoubles;

    }

}
