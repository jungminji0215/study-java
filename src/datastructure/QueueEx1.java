package datastructure;

// 두 개의 클래스 같이 사용해야 함
import java.util.LinkedList;
import java.util.Queue;

/*
 큐: 데이터를 넣은 순서대로 꺼낼 수 있는 자료구조
 카페에서 주문할 때, 줄 서있는 순서대로 주문을 받는 것과 같은 원리
 FIFO (First In First Out)
 큐는 프로세스 스케줄링 방식을 구현하는데에 많이 사용된다.
 */
public class QueueEx1 {
    public static void main(String[] args) {

        // Integer 형 queue
        Queue<Integer> queue1= new LinkedList<Integer>();

        System.out.println(queue1.add(5)); // 성공하면 true 리턴
        System.out.println(queue1);

        // 어.. add와 offer의 차이는..?

    }
}
