package assignments;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number ,op,sum=0 ;
		Scanner pp= new Scanner(System.in);
		number = pp.nextInt();
		for( int i=number;i >0 ;i--){
			op = (number % 10);
			number= (number /10);
			sum=sum+op;
		}
			System.out.println(sum);
		
	}
}

