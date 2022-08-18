package arithmetic;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		int num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an Operator:+,-,*,/,% ");
		op = sc.next().charAt(0);
		System.out.println("Enter first number");
		num1= sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		switch(op)
		{
		case '+':
			result=num1+num2;
			System.out.println(num1+"+"+num2+"=" +result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"=" +result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1+"*"+num2+"=" +result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+"=" +result);
			break;
		case '%':
			result=num1%num2;
			System.out.println(num1+"%"+num2+"="+result);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}

	}


}
