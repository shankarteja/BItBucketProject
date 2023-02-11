package annonymous;

public class AnnynomusOneplus {

	public static void main(String[] args) {
		
		Oneplus o=new Oneplus() {
			
			@Override
			public void process() {
			System.out.println("hiiiiiiiiii");	
			System.out.println("hello teja ");
			}
			
			@Override
			public void method() {
				System.out.println(" how r u teja ");
				System.out.println("how r u teja");
				
			}
		};
		o.process();
		o.method();
	}

}
