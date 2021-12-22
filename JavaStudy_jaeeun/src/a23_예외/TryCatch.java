package a23_예외;

public class TryCatch {

	
	public int[] array() throws ArrayIndexOutOfBoundsException {
		int [] arr = new int[5];
		for(int i=0; i<6; i++) {
			arr[i] = (i+1);
			System.out.println(i+ "index 삽입");
		}
		return arr;
	}
	public static void main(String[] args) {
		TryCatch tc = new TryCatch();
		int[]arrayInt = new int[5];
		
		
		
		try {
			for(int i =0; i<6; i++) {
			arrayInt[i] = (i+1); 
			System.out.println(i+ "index 입력");
		}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			arrayInt = new int [6];
			for(int i =0; i<6; i++) {
				arrayInt[i] = (i+1); 
				System.out.println(i+ "index 입력" + e.getMessage());
			}
			System.out.println("배열의 공간을 초과한 데이터 삽입이 이루어 졌습니다.");
		}catch (Exception e) {
			System.out.println("예외 발생: "+ e.getMessage());
		}finally {
			System.out.println("예외가 발생하든 안 하든 무조건 실행됨");
		}
		
		try {
			arrayInt = tc.arrays();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		arrayInt = tc.arrays();
		for(int i : arrayInt) {
			System.out.println(i);
		}
		System.out.println("프로그램 종료 완료");
	}

}
