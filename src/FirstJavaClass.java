
public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Fisrt Line");
		System.out.print("Second Line");
		System.out.println("Third Line");
		//syso + cntrl space
		
		//data types
		int i = 10; // integer 32 - 4 bytes
		System.out.println(i);
		
		//long integer 64 - 8bytes
		long y = 1992;
		System.out.println(y);
		
	    double x = 123.456;
	    System.out.println(x);
	    
	    char c1 = 's';
	    System.out.println(c1);
	    
	    boolean j = true;
	    System.out.println(j);
	    
	    int k = 10;
	    int l = 20;
	    if(k<l){
	    	System.out.println("k is the smallest: " + k);
	    }
	    
	    // find out greatest of 3 numbers
	    int a = 1000, b = 2000 , c = 300;
	    if(a>b & a>c){
	    	System.out.println("a is the greatest " + a);
	    }
	    else if(b>c)
	    {
	    	System.out.println("b is the greatest " + b);
	    }
	    else { System.out.println("c is the greatest " + c);}
	    
	    		} 

}
