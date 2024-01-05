import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            /* hasNextInt를 이용해 입력 받을 수 있는지 검사한다. */
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}

/* 
오답 노트: 런타임 에러 발생 -> 더이상 입력 받을 수 없는데 입력을 받으려고 했다
-> 수를 하나만 입력 받을 수 있으니, b 를 입력받으려고 할 때 에러가 발생한다.
            
이때는 입력의 끝을 EOF로 판단해야한다.
Scanner에서는 hasNext, hasNextInt, hasNextLong등과 같은 메소드로 판단할 수 있다.
*/
