public class sumpairs {
	public static void main(String[] args){
int add1 = 0;
int add2 = 0;
//use loop
 
int number = 4;
for(int i = 0; i < 5 ; i++){
 add1 +=number;
number *= 4;

}

number = 8;
for (int i = 0; i < 5; i++){
	add2 += number;
number *= 8;	
}
System.out.println(add1);
System.out.println(add2);
}
}