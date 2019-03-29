
public class RecapClassTask12 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, // 1. firs row index 0
				{ 10, 20, 30 }, // 2. second index 1
				{ 100, 200, 300 },// 3. third index 3
		};
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
			};
			
            System.out.println("----------For Loop---------");
			for(int [] singleArray :arr){
				for(int number : singleArray) {
					System.out.print(number + " ");
				}
				System.out.println();
			}
		}
	}
}
