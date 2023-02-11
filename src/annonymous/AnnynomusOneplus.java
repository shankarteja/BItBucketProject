package annonymous;

import java.security.PublicKey;

public class AnnynomusOneplus {

	public static void main(String[] args) {
		
		Oneplus o=new Oneplus() {
			
			
			@Override
			public void process() {
			System.out.println("hiiiiiiiiii");	
			System.out.println("hello teja ");
			System.out.println("how r u teja");
			}
			
			@Override
			public void method() {
				System.out.println(" how r u teja ");
				System.out.println("how r u teja");
				System.out.println("prepare well good");
				
			}
		};
			
		
		o.process();
		o.method();
	}

}
