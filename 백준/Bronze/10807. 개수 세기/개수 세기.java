import java.util.Scanner;	
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N,V;
        N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        V = sc.nextInt();
        int count = 0;
        for(int j = 0; j < N; j++){
            if(V == A[j]){
                count++;
            }
        }
        System.out.print(count); 
		
	}
 
}