package InterveiwPractic;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		// Write a java program to fingd the second largest number in the array?
		//Maximum and minimum number in the array?
		
int arr[] = { 1000, 46, 1, 86, 292, 2 };
        
        int min = arr[0];//0
        int secondLargest = 0;//0
        int largest = 0;//0
        
        for(int a: arr) {
            if(a>largest) {
                largest =a;
            }
            if(a < min) {
                min = a;
            }
        }
        for(int a : arr) {
            
            if(a> secondLargest && a <largest) {
                
                secondLargest = a;
            }
        }
        System.out.println("min = " + min);
        System.out.println("Second Largest = " + secondLargest);

        System.out.println("Largest = " + largest);
        

	}

}
