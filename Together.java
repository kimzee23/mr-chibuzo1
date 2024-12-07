public class printevennumber {
	public static void main(String[] args){
int add1 =0;
int add2 =0;
//use loop
int number = 4;
for(int i = 0; i < 5; i++){
	add1 += number;
	number *=4;
//second pairs
}
number = 8;
for (int i = 0; i <5; i++){
	add2 +=number;
	number *=8;



}
int sumall = add1 + add2;

//print it out

System.out.println("The total sum " + sumall);

}
}