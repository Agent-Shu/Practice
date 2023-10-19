import java.util.StringTokenizer;

class string_token1{
	public static void main(String[] args){
		StringTokenizer s= new StringTokenizer("Welcome to java","");

		while(s.hasMoreTokens()){
			System.out.print(s.nextToken());
		}
	}
}