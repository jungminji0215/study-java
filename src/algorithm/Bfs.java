package algorithm;

import java.util.HashMap;

public class Bfs {
    public static void main(String[] args) {
        // HashMap<키타입, 값타입> 변수 = new HashMap<키타입, 값타입>();
        HashMap<Integer,String> map = new HashMap<>();//new에서 타입 파라미터 생략가능
        
        // 데이터 추가
        map.put(1,"세븐틴"); 
        map.put(2,"방탄소년단");
        map.put(3,"투바투");
        
        // 데이터 읽기
        System.out.println(map);
        System.out.println(map.get(1));
        
        // 데이터 수정 
        map.put(3, "유나");
        System.out.println(map);

        // 데이터 삭제
        map.remove(2);
        System.out.println(map);
    }
}
