package MainPackage;

public class MyInteger {

	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public boolean isEven(){
		return value % 2 == 0;
	}
	public boolean isOdd(){
		return value % 2 == 1;
	}
	public boolean isPrime(){
		
		if (value <= 1)
			return false;
		
		if (value == 2)
			return true;
		
		if (isEven())
			return false;
		
		for(int i = 3; i < (int)Math.sqrt(value); i += 2)
			if (value % i == 0)
				return false;
		
		return true;
		
	}

	public static boolean isEven(int val){
		return val % 2 == 0;
	}
	public static boolean isOdd(int val){
		return !MyInteger.isEven(val);
	}
	public static boolean isPrime(int val){
		
		if (val <= 1)
			return false;
		
		if (val == 2)
			return true;
		
		if (MyInteger.isEven(val))
			return false;
		
		for(int i = 3; i < (int)Math.sqrt(val); i += 2)
			if (val % i == 0)
				return false;
		
		return true;
		
	}

	
	public static boolean isEven(MyInteger val){
		return MyInteger.isEven(val.getValue());
	}
	public static boolean isOdd(MyInteger val){
		return MyInteger.isOdd(val.getValue());
	}

	public static boolean isPrime(MyInteger val){
		return MyInteger.isPrime(val.getValue());
	}

	public boolean equals(int val){
		return val == value;
	}
	public boolean equals(MyInteger val){
		return equals(val.getValue());
	}
	
	public static int parseInt(char[] characters){
		int sum = 0;
		for(int i = 0; i < characters.length; i++){
			sum += Character.getNumericValue(characters[i]) * (int) Math.pow(10,i); 
		}
		return sum;
	}
	public static int parseInt(String characters){
		return MyInteger.parseInt(characters.toCharArray());
	}

	





}
