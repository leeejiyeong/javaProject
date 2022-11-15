package Question04;

public class ManWomen {
	public static void main(String[] args) {
		
		String[] arr = {"010102-4", "991012-1", "960304-1","881012-2","040403-3"};
		
		int mCount = 0;
		int wCount = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].charAt(7) == '1' || arr[i].charAt(7)=='3') {
				mCount++;
			}else if(arr[i].charAt(7) == '2' || arr[i].charAt(7)== '4') {
				wCount++;
			}
		}
		System.out.printf("남 : %d, 여 : %d \n", mCount, wCount);
	}
}
