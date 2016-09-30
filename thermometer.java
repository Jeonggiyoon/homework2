import java.util.*;

	class thermometer {
	
		static double input_degree;

		public static void main (String[] arg) {
			new thermometer().choice();

		}


		void choice() {
			Scanner s = new Scanner(System.in);
			System.out.print("온도를 입력하세요 : ");
			input_degree = s.nextDouble();

			String kind;
			Scanner k = new Scanner(System.in);

			System.out.print("입력한 온도가 섭씨이면 c 를, 화씨온도이면 f 를 입력하세요 : ");
			kind = k.next();
		

			if (kind.equals("c")|| kind.equals ("C"))
				new thermometer().selsius();
			else if (kind.equals("f") || kind. equals ("F"))
				new thermometer().fahrenheit();
			else 
				System.out.println("잘못 입력 하셨습니다.");


		}

		void selsius() {
			double  c;
			c = input_degree * 1.8 + 32;

			System.out.printf("변환된 온도는 %1f 입니다. \n", c);

		}

		void fahrenheit() {
			double f;
			f = (input_degree - 32) / 1.8;

			System.out.printf("변환된 온도는 %1f 입니다. \n", f);

		}


	}

