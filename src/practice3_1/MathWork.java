package practice3_1;

import java.util.Scanner;

public class MathWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         InputTest();
         //RandomTest();
         
	}
	public static void  InputTest()
	{int right=0;
	   for(int i=0;i<10;i++){
		    int a1,a2,a3,a12,a13;
			//a1=(int) (Math.random()*10)+1;
			a12=(int) (Math.random()*10)-5;
			a13=(int) (Math.random()*10)-5;
			a2=-a13-a12;
			a3=a12*a13;
			System.out.println("x2+"+a2+"x+"+a3+"=0");
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("�������һ����");
	        int a =input.nextInt();
	       
	        System.out.println("������ڶ�����");
	        int b=input.nextInt();
	       if(-a2==a+b&&a3==a*b){
	    	   System.out.println("�����");
	    	   right=right+1;
	       }
	       else{System.out.println("�����:)");
	           
	       }
	   }
	   if(right>6){
	   System.out.println("������"+right+"����"+",������");
	   }
	   else{ System.out.println("�ٺú������ֽ���ʽ����");}
	}
	public static void RandomTest(){
		
		for(int i=0;i<100;i++){ 
			int a;
			a=(int) (Math.random()*10)+1;
		    System.out.println(a); 
		} 
	}
		
	}
