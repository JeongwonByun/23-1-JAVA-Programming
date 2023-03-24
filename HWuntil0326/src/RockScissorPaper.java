import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2) 중 숫자를 입력하시오. : ");
		int user = sc.nextInt();
		
		int computer = (int) (Math.random()*3);
		if(user==computer)
			System.out.println("인간:" + user + " 컴퓨터:" + computer + " 비겼습니다");
		else if(user==(computer+1)%3)
			System.out.println("인간:" + user + " 컴퓨터:" + computer + " 인간 승리");
		else
			System.out.println("인간:" + user + " 컴퓨터:" + computer + " 컴퓨터 승리");

	}

}
