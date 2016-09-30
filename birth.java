import java.util.*;

	class birth {
		static int age = 0;

		public static void main (String[] arg) {
			new birth().start();
			new birth().print();

		}


		void start () {
			Scanner s = new Scanner(System.in);
			System.out.print("생년월일을 입력하세요: ");
			int year = s.nextInt();

			age = 2016 - year + 1;

		}


		void print () {
			if (age < 20)
				System.out.println("미성년자 입니다.");
			else 
				System.out.println("미성년자가 아닙니다. ");

		}


		}
