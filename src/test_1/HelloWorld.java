package test_1;

public class HelloWorld {
	public static void main(String[] args)  {
		sl(8);
		System.out.println();
}

public static void  fd(){
	int[] a=new int[]{3,5,2,6,1};
	int temp;
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(a[i]>a[j+1]){
				temp=a[i];
				a[i]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
}
public static void  pri1(){
	for(int q = 0;q<101;q++){
		System.out.println(q);
	};
}
public static int  pri2(){
	int k = 0;
	int[] b=new int[k];
	for(int i=1;i<k;i++){
		b[0]=1;
		b[1]=1;
		b[i+1]=b[i]+b[i-1];
	}
	return k;
	
}

public static int sl(int a){
	if (a<3){
		return 1;
	}
	else{
		int k;
		k=sl(a-1)+sl(a-2);
	
		return k;
		
	}
	
}


}