import java.util.*;
class A06{
	public static void main(String[] args){
		new A06().student();
	
	}
	
	void student(){
		Scanner s = new Scanner(System.in);
		System.out.println("====================");
		System.out.print("이름 : ");
		String name = s.next();

		System.out.print("국어 점수를 입력 : ");
		int kor = s.nextInt();

		System.out.print("수학 점수를 입력 : ");
		int math = s.nextInt();

		System.out.print("영어 점수를 입력 : ");
		int eng = s.nextInt();

		int total, avg = 0;
		total = kor + math + eng;
		avg = total / 3;

		if (avg >= 90)
			System.out.print("학점은 A+ 입니다.");
		else if (avg >= 80)
			System.out.print("학점은 B+ 입니다.");
		else if (avg >= 70) 
			System.out.print("학점은 C+ 입니다.");
		else if (avg >= 60)
			System.out.print("학점은 D+ 입니다.");
		else 
			System.out.print(" 학점은 F 입니다.");


		
	}
}
