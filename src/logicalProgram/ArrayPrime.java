package logicalProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrime {
    public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	System.out.println("ENTER NUMBER ");
	int num=sc.nextInt();
	//1.COUNT THE NUMBER
	int count=0,n1=num;
	while(num>0) {
		num=num/10;
		count++;
	}
	//2.CREATE ARRAY WITH SIZE(TAKE COUNT AS A SIZE)
	int[]a= new int[count];
	
	//3.REVERSE GIVEN NUMBER 
	int rev=0;
	while(n1>0) {
		int rem=n1%10;
		rev=(rev*10)+rem;
		n1=n1/10;
	}
	//4.EXTRACT DIGIT FROM REV
int i=0;
while(rev>0) {
	int rem=rev%10;
	a[i]=rem;
	i++;
	rev=rev/10;
}
System.out.println("ARRAY ELEMENTS ARE: ");
System.out.println(Arrays.toString(a));

//5.print prime digit
		System.out.println("               ");
		System.out.println("PRIME ELEMENTS ARE: ");
		for (int k = 0; k < count; k++) {
			int c = 0;
			for (int l = 1; l < a[k]; l++) {
				if (a[k] % l == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(a[k] + " ");
			}
		}
	}
}



