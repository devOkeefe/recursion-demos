package recursionDemos;
public class powers {
	public static long power(int base,int exp){
		if (exp == 0){
			return 1;
		}
		return base*power(base,exp-1);
		
	}
	public static void main(String[] args) {
		System.out.println(power(3, 5));
	}

}
