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

### java.lang
- Object
  - equals(Object obj)
    - 객체 자신과 객체 obj가 같은 객체인지 알려준다. 
  - hashCode()
    - 객체 자신의 해시코드를 반환한다. (객체의 주소를 int로 변환해서 반환) 
    - equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야 한다.

<br>

### Collection Feamework
- List는 순서가 있으며 중복 허용한다.
  - [ArrayList](https://wjdalswl0215.tistory.com/119?category=1020684)
    - [remove(1), remove(new Integer(1)) 차이 학습](https://wjdalswl0215.tistory.com/129?category=1021955) 
  - LinkedList 
  - Stack
    - 저장(push)
    - 추출(pop) 
  - Queue
    - 인터페이스여서 이를 구현한 것 사용해야한다. (LinkedList)
    - 저장(offer)
    - 추출(poll)
- Set은 순서가 없고 데이터의 중복을 허용하지 않는다.
- Map은 key와 value의 쌍으로 이루어진 데이터의 집합이다. 순서가 없으며, key는 중복을 허용하지 않고, value는 중복을 허용한다.
- Iterator
  - List, Set 컬렉션은 각각의 구조가 모두 다르며 데이터를 읽는 방법도 다 다르다 따라서 컬렉션에 저장된 요소들을 읽는 방법을 표준화한 것을 사용하면 어떤 자료구조를 사용하든 Iterator에 있는 hasNext(), next() 메서드를 사용하여 데이터를 읽어올 수 있다.
- HashSet
  - set 인터페이스를 구현한 대표적인 컬렉션 클래스
  - 순서 유지하려면 LinkedHashSet 클래스 사용
- TreeSet
  - 범위 검색와 정렬할 때 사용  
  - but, HashSet보다 데이터 추가, 삭제 시간이 더 걸린다.
- hash, hashtable

<br>

### Generics
제네릭스는 컴파일 시에 타입을 체크해 주는 기능이다.
- 타입 체크와 형 변환을 생략할 수 있다.
