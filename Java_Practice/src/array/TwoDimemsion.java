package array;

public class TwoDimemsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		int arr2 [][] = new int[2][3];
		
		for(int i=0; i<arr.length;i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		
		System.out.println("=============================");
		
		// 알파벳 소문자를 2글자씩 13줄로 출력하는 프로그램을 이차원 배열로 구현하기 
		
		char alphabets[][] = new char[13][2];
		char ch = 'a';

		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++, ++ch) {
				alphabets[i][j] = ch;
			}

		}

		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i]);
		}
	}

}
