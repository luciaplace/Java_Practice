package abstract_ex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Computer c1 = new Computer(); <-추상클래스는 인스턴스화 할 수 없음. 
		Computer c2 = new DeskTop();
		//Computer c3 = new Notebook();
		Computer c4 = new MyNoteBook();
		
	}

}
