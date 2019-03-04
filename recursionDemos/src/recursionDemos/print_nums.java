package recursionDemos;
public class print_nums {
	public static void Print(int n){
		if (n == 0){
			System.out.print(n+" ");
			
		}
		
		else{
			
			//having it here means the change is made initially which forces n = 2 from the start
			System.out.print(n+" ");
			Print(n-2);
			//it runs print -1 intil it hits 3 meaning the if statement is now true and it exits
		}
	}
	public static void main(String[] args) {
		Print(10);
	}

}
