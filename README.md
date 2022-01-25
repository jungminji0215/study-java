# 자바 공부하는 저장소
- [자바 - 자료구조 & 알고리즘](https://fastcampus.co.kr/dev_online_codingtest)
- [자바의 정석](https://github.com/castello/javajungsuk3/tree/master/%EC%97%B0%EC%8A%B5%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4)

<br>

## 자바

### 오버라이딩
상속받은 메서드의 내용을 변경하는 것

<br>

### 다형성
- 여러 가지 형태를 가질 수 있다.
- 조상 타입의 참조 변수로 자손 타입의 객체를 다루는 것이다.
- 참조변수의 형변환
  - 참조 변수의 형 변환은 참조하고 있는 인스턴스에서 사용 가능한 멤버를 조절하기 위해 사용한다.
  - 형변환 전에 instanceof 연산자로 현재 참조 변수가 참조하고 있는 인스턴스의 타입을 확인하는 것이 좋다.
    - instanceof는 참조변수를 형변환하기 전에 형변환 가능한지 알아보기 위해서 사용한다. 

<br>

### 예외 처리
- try-catch-finally문
  - finally는 예외 발생여부와 상관없이 수행되어야 하는 코드
```java 
try{

}catch (Exception e){

}finally {
   // try 블럭 안에 return문이 있어도 실행 됨
}
```
- 예외 선언하기 (예외 떠넘기기)
  -  자신을 호출한 대상에게 예외를 알리는 것
  -  메서드 안에서 예외를 처리할지, 예외를 호출한 곳에게 떠넘길지

<br>

### Collection Feamework
- List는 순서가 있으며 중복 허용한다.
  - [ArrayList](https://wjdalswl0215.tistory.com/119?category=1020684)
    - [remove(1), remove(new Integer(1)) 차이 학습](https://wjdalswl0215.tistory.com/129?category=1021955) 
  - LinkedList 
  - Stack
  - Queue
    - 인터페이스여서 이를 구현한 것 사용! (LinkedList)
- Set은 순서가 없고 데이터의 중복을 허용하지 않는다.
- Map은 key와 value의 쌍으로 이루어진 데이터의 집합이다. 순서가 없으며, key는 중복을 허용하지 않고, value는 중복을 허용한다.
