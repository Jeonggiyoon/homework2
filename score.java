import  java.util.*;

class score {
    
        public static void main(String[] args) {
		Scanner j = new  Scanner(System.in);
			System.out.print("국어 점수를 입려하세요 : ");
		int kor = j.nextInt();
			System.out.print("영어 점수를 입려하세요 : ");
		int eng = j.nextInt();
			System.out.print("수학 점수를 입려하세요 : ");
		int math = j.nextInt();
								        
		int total =  kor + eng + math;
		int avg = total/3;
			System.out.printf("입력하신 점수의 총점은 %d 이고, \n", total);
			System.out.printf("평균은 %d 입니다. \n", avg);
													        
		if (kor >=90) 
			System.out.println("국어 점수가 우수합니다 .");
		if (eng >=90) 
			System.out.println("영어 점수가 우수합니다.");
		if (math >=90) 
			System.out.println("수학 점수가 우수합니다.");
																					           
						  }
	}

