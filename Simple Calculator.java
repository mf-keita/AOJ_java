import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		/*EOFまでループするよ。つまり、入力があるまでループするよ*/
		while(in.hasNext()){
			String line = in.nextLine();
			String[] Array = line.split(" ");
			int a = Integer.parseInt(Array[0]);
			int b = Integer.parseInt(Array[2]);
			/*文字列の比較はequalsメソッドを使うよ*/
			if(Array[1].equals("op")){
				break;
			}
			if(Array[1].equals("+")){
				System.out.println(a+b);
			}else if(Array[1].equals("-")){
				System.out.println(a-b);
			}else if(Array[1].equals("*")){;
			System.out.println(a*b);
			}else if(Array[1].equals("/")){
			System.out.println(a/b);
			}else{

			}
		}
	}
}