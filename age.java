import java.util.*;

class age {
    static int birth_year;
    static int age;
	    
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
			System.out.print("태어난 년도를 입력하세요 : ");
		birth_year = b.nextInt();
					        
		age = 2016 - birth_year + 1;
							        
		if ( age > 0 && age <13)
			System.out.println("유아입니다.");
		else if ( age >= 13 && age <20)
			System.out.println("청소년입니다.");
		else if ( age >= 20 && age <30)
			System.out.println("청년입니다.");
		else if ( age >= 30 && age <60)
			System.out.println("중년입니다.");
		else if ( age >= 60 )
			System.out.println("노년입니다.");
		else 
			System.out.println("당신은 누구신가요");
						 }
																							        
																								}
