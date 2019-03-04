package recursionDemos;


public class print_nums_reverse {
public static void Print(int n){
	if (n == 0){
		System.out.print(n+" ");
	}else if(n == 3) {
		System.out.println(n*3);
		n = 3;
	}else{
		System.out.print(n+" ");
		Print(n-1);
		//our initial instance of n in this case is 10 and then we will just be subtracting from our initial value
	}
}
public static void main(String[] args) {
	Print(10);
}
}
