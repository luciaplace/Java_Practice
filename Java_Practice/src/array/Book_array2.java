package array;

public class Book_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book_array library[] = new Book_array[5];

		library[0] = new Book_array("태백산맥", "조정례");
		library[1] = new Book_array("데미안", "헤르만헤세");
		library[2] = new Book_array("어떻게 살 것인가", "유시민");
		library[3] = new Book_array("토지", "박경리");
		library[4] = new Book_array("어린왕자", "생텍쥐베리");

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

		// arraycopy를 사용하여 객체 배열 복사 (얉은 복사)
		
		Book_array library2[] = new Book_array[5];
		System.arraycopy(library, 0, library2, 0, 5);
		
		for (int i = 0; i < library2.length; i++) {
			library2[i].showBookInfo();
		}
		for (int i = 0; i < library.length; i++) {
			System.out.println(library2[i]);
		}
		
		// 깊은 복사(해시코드 값 달라짐)
		
		Book_array library3[] = new Book_array[5];
		
		library3[0] = new Book_array();
		library3[1] = new Book_array();
		library3[2] = new Book_array();
		library3[3] = new Book_array();
		library3[4] = new Book_array();
		
		for (int i = 0; i < library.length; i++) {
			library3[i].setAuthor(library[i].getAuthor());
			library3[i].setBookName(library[i].getBookName());
		}
		
		for (int i = 0; i < library3.length; i++) {
			library3[i].showBookInfo();
		}
		
		for (int i = 0; i < library3.length; i++) {
			System.out.println(library3[i]);
		}
	}

}
