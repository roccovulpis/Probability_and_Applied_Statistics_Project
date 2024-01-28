
public class TestExample {

	public static void main(String[] args) {
		Example test = new Example();
		int[] mySampleNumbers = {10, 20};
//		double storeMeanResults = test.findMean(mySampleNumbers);
//		double storeMedianResults = test.findMedian(mySampleNumbers);
//		double storeModeResults = test.findMode(mySampleNumbers);
		double storeStandardDeviationResults = test.findStandardDeviation(mySampleNumbers);
		
//		System.out.println("The mean is: " + storeMeanResults);
//		System.out.println("The median is: " + storeMedianResults);
//		System.out.println("The mode is: " + storeModeResults);
		System.out.println("The standard deviation: " + storeStandardDeviationResults);

	}

}
