package ch07;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    Set<Object> hset = new HashSet<Object>();

    private void addMethod() {
        hset.add(Integer.valueOf(1));
        hset.add("Hello");
        hset.add("Hello"); // 동일한 데이터 추가 확인
        hset.add(1); // 기본형은 wrapper를 통해 추가   //데이터 추가 결과: [1, Hello] 데이터 중복 불
        // TODO: SmartPhone 타입의 객체를 추가해보자.
        hset.add(3); //입력순서x -> 데이터 추가 결과: [1, 3, Hello]
        hset.add(new SmartPhone("010"));
        hset.add(new SmartPhone("010")); //2개가 같냐? = 1) 같은 객체 참조? 2) 같은 내용? (일반적)
        // END
        System.out.println("데이터 추가 결과: " + hset);
    }

    private void retrieveMethod() {
        System.out.println("데이터 개수: " + hset.size());

        for (Object sobj : hset) {
            System.out.println("데이터 조회: " + sobj);
        }
    }

    private void removeMethod() {
        hset.remove("Hello");
        System.out.println("데이터 삭제 결과: " + hset);
    }

    public static void main(String[] args) {
        SetTest test = new SetTest();
        test.addMethod();
//        test.retrieveMethod();
//        test.removeMethod();
        //update가 없음  - 어디있는지 찾기 어려워서 = index가 없어서 
    }
}
