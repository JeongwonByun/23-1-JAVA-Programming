
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, b=0, s=0;
		for(i=1;i<5;i++) {
			for(b=1;b<6-i;b++)
				System.out.print(" ");
			for(s=1;s<i*2;s++)
				System.out.print("*");
		System.out.print("\n");
		}
		for(i=5;i>0;i--) {
			for(b=1;b<6-i;b++)
				System.out.print(" ");
			for(s=1;s<i*2;s++)
				System.out.print("*");
		System.out.print("\n");
		}
		
	}
}
