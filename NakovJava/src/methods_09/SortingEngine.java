package methods_09;

public class SortingEngine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[]{10,3,5,-1,0,12,8};
		
		System.out.print("Before: ");
		for (int each : array ){
			System.out.print(each + " ");
		}
		System.out.println();
		
		sort(array);
		
		System.out.print("After: ");
		for (int each : array ){
			System.out.print(each + " ");
		}
		System.out.println();
	}
	
	private static int[] sort(int... numbers){
		
		int arraySize = numbers.length;
		int begin = 0;
		
		while (begin < arraySize){
			int minVal = numbers[begin];
			int minIdx = begin;
			
			for (int idx = begin; idx < arraySize; idx++){
				if (minVal > numbers[idx]){
					minVal = numbers[idx];
					minIdx = idx;
				}
			}
			int temp = numbers[begin];
			numbers[begin] = numbers[minIdx];
			numbers[minIdx] = temp;
			begin++;
		}
		
		return numbers;
	}

}
