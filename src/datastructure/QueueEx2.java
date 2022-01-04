// fastcampus - '한번에끝내는코딩테스트369Java편초격차패키지' 연습문제
package datastructure;

import java.util.ArrayList;

// enqueue, dequeue 기능 구현해보기
// dequeue 기능 호출할 때 데이터 없으면 null 리턴
public class QueueEx2<T> {

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(){
        System.out.println(queue.isEmpty()); // 무엇을 반환하는지 궁금해서...

        if(queue.isEmpty()){
            return null;
        }

        return queue.remove(0);
    }
    public static void main(String[] args) {
        QueueEx2<Integer> mq = new QueueEx2<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

    }
}

// 으악 더 많이 공부해야겠다