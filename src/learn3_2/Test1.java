package learn3_2;
// 50-60 100���  д��ÿ���ĸ���
//50-60 100���  д��53�ĸ��ʴ���20%
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
           /*String s1=new String("abc");
           String s2=new String("abc");
           System.out.println(s1.equals(s2));//�ַ����Ա�
           System.out.println(s1==s2);//ֵ�Ա�
  */
		//jiami();
		random();
		//arrar();
	}
public void encode() throws Exception{
	String s3="��";
	byte[] bs1=s3.getBytes("gbk");
	for(byte b:bs1){
		System.out.println(b);
	}
}
public static void pr() throws Exception{
	char a='a';
	for(int i=0;i<27;i++){ 
	
	System.out.println(a=(char) (a+1));
}}

public static void jiami() throws UnsupportedEncodingException{
	Scanner input = new Scanner(System.in);
    System.out.println("������");
    char a =(char) input.nextByte();
    char b = (char)(a+1);
    
    System.out.println(b);
  
    
}
public static void random(){
	float a1=0;
	float c0 = 0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
	for(int i=0;i<1000000;i++){
	int a,b;
	
	a=(int) (Math.random()*9);
	if (a==0) {
		b=53;
	}
	else{
		b=(int) (Math.random()*10)+50;
	}
	switch (b) {
	case 50:
		c0=c0+1;
		//System.out.println("50�ĸ���"+c0/1000000);
		break;
	case 51:
		c1=c1+1;
		//System.out.println("51�ĸ���"+c1/1000000);
		break;
	case 53:
		c3=c3+1;
		//System.out.println("53�ĸ���"+c0/1000000);
		break;
	default:
		break;
	}
	
	}
	System.out.println("53�ĸ���"+c3/1000000);
}
public static void rantest(){
	int a;
	a=(int) (Math.random()*10)+50;
	System.out.println("������"+a);
	if(a==51){
		
		
	}
}
public static void arrar() {
	float a=(float) 1111111112.3;
	float b=(float) 2.8;
	int c=(int) a;
	int d=(int) b;
	System.out.println(c);
	System.out.println(d);
	

	}

}

