package ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    // 문자열을 저장할 List, 구현체는 ArrayList
	// List는 [인터페이스]여서 얘가 객체를 만들 수는 없고 
	// 대신 자식을 참조 가능하므로 구현체인 ArrayList를 참조  객체 생성.
	
//    List<String> friends = new ArrayList<>();
    List<String> friends = new LinkedList<>();

    public static void main(String[] args) {

        ListTest alt = new ListTest();
        alt.createTest();
//        alt.retrieveTest();
        alt.updateTest();
        alt.deleteTest();
    }

    public void createTest() {
        // TODO: friends에 여러명의 친구를 등록해보자.
    	friends.add("홍길동"); //그냥 add는 List에 선언되어있는 녀석
    	friends.add("홍길동"); //동일 데이터
    	friends.add("장길산");
    	friends.add(0,"임꺽정"); //insert //다 오버라이드 되어 있나봄 얘도 List에 선언되어있는 녀석
    	friends.add("이몽룡");//append

        // END
        System.out.println("추가 후 내용 출력: " + friends);
    }

    public void retrieveTest() {
        // TODO: 다양한 조회 기능을 사용해보자.
        //  혹시 비어있지는 않나? 요소의 개수는 ?
    	System.out.println("비어있나??"+friends.isEmpty()); 
    	System.out.println("size??"+friends.size()); 
        //  반복을 이용한 요소 순회
    	for (int i = 0; i < friends.size(); i++) {
    		System.out.println(i+":"+friends.get(i));
    	}
    	for (String str: friends) {
    		System.out.println(str);
		
    	}
        //  홍길동이 있다면 그 위치 출력
    	System.out.println(friends.indexOf("홍길동")); // 1
    	System.out.println(friends.indexOf("홍길순")); //없으면 -1
        // END
    }

    public void updateTest() {
        // TODO: 홍길동이 있다면 값을 율도국 왕으로 변경해보자.
    	int idx = friends.indexOf("홍길동");
    	if(idx>=0) {
    		friends.set(idx, "율도국왕");
    	}
        // END
    	System.out.println("수정후 "+ friends); //수정후 [임꺽정, 율도국왕, 홍길동, 장길산, 이몽룡]
    }

    public void deleteTest() {
        // TODO: 0번째 친구와 율도국 왕을 삭제하시오.
    	friends.remove(0); 
    	friends.remove("율도국왕");
    	
        // END
        System.out.println("삭제 후 : " + friends); //삭제 후 : [홍길동, 장길산, 이몽룡]
        friends.clear();// 리스트 초기화
        System.out.println("초기화 후 : " + friends); //초기화 해서 완전 없어짐 : []
    }
}
