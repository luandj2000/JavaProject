package Training;

public class Basics {

	public static void main(String[] args) {
	
//		// String stored and printed.
//		String nameVariable = "John";
//		System.out.println(nameVariable);
//		
//		// Integer stored and printed.
//		int myNum = 15;
//		System.out.println(myNum);
//		
//	    // Character stored and printed
//		char charNum = 'N';
//		System.out.println(charNum);
//		
//		//boolean value stored and printed.
//		boolean happy = true;
//		System.out.println(happy);
//		
//		// float value stored and printed.
//		float decimal = 15.45f;
//		System.out.println(decimal);
//		
//		int x = 160 + 40;
//		System.out.println(x);
//		
//		int sum1 = x * 5;
//		int sum2 = sum1/5 -10;
//		System.out.println(sum2);
//		
//		int increment = 5;
//		increment++;
//		System.out.println(increment);
//		
//		int decrement = 10;
//		decrement--;
//		System.out.println(decrement);
//		
//		int modus = 5%2;
//		System.out.println(modus);
		
//		int num1 = 10;
//		int num2 = 5;
//		System.out.println(!(num2 == 5));
		
//		String text = "Vrkvbrkvber";
//		System.out.println(text.length());
//		System.out.println(text.toLowerCase());
//		System.out.println(text.toUpperCase());
//		
//		String index = "Please locate where 8 is in the char";
//		System.out.println(index.indexOf("8"));
//		String test = "vrrvrv";
//		System.out.println(test.substring(5,10)); 	
//		int randomNum = (int)(Math.random() *100);
//		System.out.println(randomNum);
		
//		boolean isJavaFun = true;
//		boolean isFishTasty = false;
//		System.out.println(isJavaFun);
//		System.out.println(isFishTasty);

		
//		int x = 10;
//		int y = 6;
//		
//		if(x<y){
//			
//			System.out.println(x + "is biiger than"+ y);
//			
//		}else
//		{
//			System.out.println("Is life real");
//		}
		
//		int age = 22;
//				
//				if (age <13){
//					
//					System.out.println("You are a child.");
//					
//				}else if(age <21){
//					
//				System.out.println("You are a teenager.");
//				
//				}else {
//					
//					System.out.println("You are an adult.");
//					
//				}
		
//		int time1 = 20;
//		// Called short hand
//		String result1 = (time1 < 18) ? "Good day." : "Good Evening";
//		System.out.println(result1);
//				
//				
//		int count = 5;
//		do {
//		int day1 = 7;
//		switch(day1) {
//		
//		case 6: System.out.println("Saturday");break;
//		case 7: System.out.println("Sunday");break;
//		default: System.out.println("Not weekend :(");break;
//		}
//		count--;
//		}while (count >0);
//		
//		
		
//		String car [] = {"Volvo", "Ford", "Mazda"};
//		for(String i : car)
//		{
//			
//			System.out.println(i);
//		}
//		String [] fruit = {"Apple","Banana","Pear", "Orange"};
//		for(String j : fruit)
//		{
//			System.out.println("The chosen fruit is: " + j);
//			
//		}
		String [] friends = {"Jannie","Sannie","Pietie", "Darth Vader"};
		for(String j : friends)
	{
			if(j.equalsIgnoreCase("Pietie"))
			System.out.println("This is my friend: " + j);
		
		}
		
		String text = "Hello";
		String name = "Luan";
		System.out.println(text + "\n"+name);
		
		
		
		
		
	}

}
