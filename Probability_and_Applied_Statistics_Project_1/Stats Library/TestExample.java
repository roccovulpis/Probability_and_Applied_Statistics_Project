
public class TestExample {

	public static void main(String[] args) {
		Example test = new Example();
		
		int[] mySampleNumbers = {6,2,4,9,5,6,1,7,3};
		double storeMeanResults = test.findMean(mySampleNumbers);
		double storeMedianResults = test.findMedian(mySampleNumbers);
		double storeModeResults = test.findMode(mySampleNumbers);
		
		System.out.println("The mean is: " + storeMeanResults);
		System.out.println("The median is: " + storeMedianResults);
		System.out.println("The mode is: " + storeModeResults);

	}

}
