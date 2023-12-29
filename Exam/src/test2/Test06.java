package test2;
import java.util.Scanner;

/*
 * 날짜 : 2023/12/29
 * 이름 : 김광은
 * 내용 : 자바 배열 최대값 찾기 연습문제
 */
public class Test06 {
	public static void intro(){
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static □□□ input(Scanner sc, □□□□□□){
		System.out.print("변수 " +  name + " 값 입력 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public static □□□ result(□□□□□□){
		System.out.println("덧셈 결과 : " + val);
		System.out.println("******* END *******");
	}
	
	public static □□□ add(int x, int y){
		return x+y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		void intro();
		
		int a = input(sc, "a");
		int b = input(sc, "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
	}
}