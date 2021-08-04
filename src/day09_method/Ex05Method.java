package day09_method;

import java.util.Scanner;

public class Ex05Method {
	public int sumFunc(int n,int n2) {
		int sum = n+n2;
		return sum;
	}
	public void test(int n) {
		if(n==1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return ;
		}System.out.println("test메소드 종료");
	}
}
