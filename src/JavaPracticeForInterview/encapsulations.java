package JavaPracticeForInterview;

public class encapsulations {
	
	private int atmNo =456789;
	private int atmPassword= 4567 ;
	private int cvvNo =4567;
	
	
	public int getAtmNo() {
		return atmNo;
	}
	
	public int getAtmPassword() {
		return atmPassword;
	}
	
	public int getCvvNo() {
		return cvvNo;
	}
	
	
	public static void main(String [] args) {
		encapsulations e = new encapsulations();
		
		System.out.println("atmNO  "+e.getAtmNo());
		System.out.println("atmPassword"+e.atmPassword);
		System.out.println("cvvNo "+e.cvvNo);
		
		
		
		
		}
	
	

}
