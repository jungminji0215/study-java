package basic;

/*
    StringBuilder은 문자열을 만들고 조작하는 데 사용되는 클래스이다.
    String과 차이점은 String은 수정을 할 수 없다.

    buffer : 데이터를 임시로 저장하는 메모리

   StringBuilder은 StringBuffer이랑 같은데, 한가지 차이점은
    StringBuilder은 동기화가 안 되어 있다.
    멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하!
    멀티 쓰레드 프로그램이 아니면 굳이 StringBuffer 쓸 필요 없다!
 */
public class StringBuilderEx1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("정민지");
        System.out.println(sb);
    }
}
