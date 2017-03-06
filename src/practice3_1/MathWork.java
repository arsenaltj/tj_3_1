package practice3_1;

import java.util.Scanner;
import java.util.TimeZone;

public class MathWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //InputTest();
         //RandomTest();
         Datet();
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
			System.out.println("x^2+"+a2+"x+"+a3+"=0");
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("请输入第一个解");
	        int a =input.nextInt();
	       
	        System.out.println("请输入第二个解");
	        int b=input.nextInt();
	       if(-a2==a+b&&a3==a*b){
	    	   System.out.println("答对了");
	    	   right=right+1;
	       }
	       else{System.out.println("算错了:)");
	           
	       }
	   }
	   if(right>6){
	   System.out.println("你答对了"+right+"道题"+",还不错");
	   }
	   else{ System.out.println("再好好练练分解因式法吧");}
	}
	public static void RandomTest(){
		
		for(int i=0;i<100;i++){ 
			int a;
			a=(int) (Math.random()*10)+1;
		    System.out.println(a); 
		} 
	}
    public static void Datet(){
    	TimeZone tz=TimeZone.getDefault();
    	System.out.println("sun.util.calendar.ZoneInfo[id=Asia/Xian,offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null]");
    }
	}
