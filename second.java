import java.util.*;


 class second { 
    static int seconds;
        
	    void calculator () {
	            Scanner s = new Scanner(System.in);
		    	System.out.print("날수를 입력하세요 : ");
		    int days = s.nextInt();
		    seconds = days * 24 * 60 * 60 ;
		    	System.out.printf("날수에 해당되는 기간은 모두 %d 초입니다.\n", seconds);
						            
	            int count =  seconds / 1000000;
		    	System.out.printf("100만 초가 모두 %d 번이나 포함됩니다.", count);
								            
			        }

									    
	    public static void main(String[] args) {
	            new second().calculator();
													        
						 }
														       
														        
															
		}

