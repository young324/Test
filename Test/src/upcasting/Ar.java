package upcasting;
import java.util.Scanner;

//지인들 (친구들,동료)정보 저장해서 불러오는 프로그램
public class Ar {
	public static void main(String[] args) {
		My m =new My(5);

		while(true) {   //무한루프 ->break
			System.out.println("1.고딩친구 정보 저장하기");
			System.out.println("2.동료 정보 저장하기");
			System.out.println("3.모든 지인들 정보 다 출력");
			System.out.println("4.기본정보만 출력");
			System.out.println("5.종료");
			System.out.println("선택: ");

			Scanner s=new Scanner(System.in);
			int select=s.nextInt();

			switch(select) {
			case 1:
			case 2:
				m.save(select);  //함수호출
				break;
			case 3:
				m.all();
				break;
			case 4:
				m.show();
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
		}  
	}
}