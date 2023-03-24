import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int guess=0, count=0;
		do {
			System.out.print("정답을 추측하여 보시오 : ");
			guess = sc.nextInt();
			count++;
			if(guess<answer)
				System.out.println("제시한 정수가 낮습니다.");
			if(guess>answer)
				System.out.println("제시한 정수가 높습니다.");
		}
		while(guess!=answer); 
			System.out.println("축하합니다. 시도횟수 = " + count);
		
		
		
	}

}
