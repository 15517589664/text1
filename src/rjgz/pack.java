package rjgz;

import java.util.Random;
public class pack {

	public static void main(String[] args) {
		int[] a= new int [50];
		int[] b= new int [50];
		int[] c= new int [50];
		printHeader();
		generateEquations(a,b,c);
		printExercise(a,b,c);
		printCalculations(a,b,c);

	}
	static void  printHeader() {
	}
	static void generateEquations(int[] a,int[] b,int[] c) {
		System.out.println("输出五十道100以内的加减法算式习题：");
		Random r=new Random();
		for(int i = 0; i < 50; i++) {
			a[i] = r.nextInt(101);
			b[i] = r.nextInt(101);
			c[i] = r.nextInt(2);
			if(c[i] == 0) {
				if(a[i] - b[i] < 0) {
					i--;
					continue;
				}		
			}
			else {
				if(a[i] + b[i] > 100) {
					i--;
					continue;
				}
				
			}
			int flag = 0;
			for(int j = i-1; j >=0; j--) {
				if(a[i] == a[j] && b[i] == b[j] && c[i] == c[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				i--;
				continue;
			}
		}
	}
	static void printExercise(int[] a,int[] b,int[] c) {
		for(int i = 0; i < 50; i++) {
			if(c[i] == 0) {
				System.out.println("" + a[i] + "-" + b[i]+"=");
			}
			else{
				System.out.println("" +a[i] + "+" + b[i]+"=");
			}
			if(i%1 == 0) {
				System.out.println("");
			}
		}
	}
	static void printCalculations(int[] a,int[] b,int[] c) {
		    System.out.println("习题答案：");
		for(int i = 0; i < 50; i++) {
			if(c[i] == 0) {
				System.out.println(a[i] - b[i]+"  ");
			}
			else{
				System.out.println(a[i] + b[i] + "  ");
			}
			if(i%1 == 0) {
				System.out.println("");
			}
		}
	}
}