
public class ForLoop {

	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5,6};
		
//		for ( int i=0;i<ar1.length;i++){  //only even no
//			if(ar1[i]%2==0) {
//				System.out.println(ar1[i]);
//				}
//		}
//		///////////////////////////////////////////////
//		//Enhanced for loop
//		System.out.println("Enhanced for loop");
//		for (int j:ar1) {
//			System.out.println(j);
//		}
//		System.out.println("for enhanced with condition only even");
//		for(int k:ar1){
//			if (k%2==0){
//				System.out.println(k);
//			}
//		}
		System.out.println("will test break,continue");
		for (int l= 0;l<ar1.length;l++) {
			if (ar1[l]==2){
				System.out.println("value 2 will be skipped ");
				continue;
				
			}
			else {
				if (ar1[l]==4){
					System.out.println("value 4 is a break point as a result 5,6 will be out of loop/iteration");
					break;
			
			}
			else{
				System.out.println(ar1[l]);
				
				}
		}
			
	}
}
}