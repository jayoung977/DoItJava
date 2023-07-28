package ch07;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    Map<String, String> hMap = new HashMap<>();

    private void addMethod() {
    	System.out.println(hMap.put("hong", "010-1234")); // null
    	System.out.println(hMap.put("hong", "011-5467")); //010-1234 , 중복시 value 덮어버림 ->putIfAbsent

    	hMap.put("jang", "010-2345");
    	hMap.put("kim", "010-2345");
    	hMap.putIfAbsent("kim", "some");

        System.out.println("추가 결과: " + hMap); //추가 결과: {hong=011-5467} //추가 결과: {hong=011-5467, jang=010-2345, kim=010-2345}
    }

    private void retrieveMethod() {
        // TODO: kate의 전화번호가 있나요?
    	String val = hMap.get("kate");
    	System.out.println(val);
    	val = hMap.getOrDefault("lim", "010-1234-5678"); //getOrDefault default 메서드 , 값이 없을떄 기본값 넣어주는 기능
    	System.out.println(val); //010-1234-5678
        // END

        // TODO: map이 가지고 있는 key와 거기에 연결된 value를 출력하시오.

    	Set<String> keys= hMap.keySet();
    	for(String key: keys) {
    		System.out.println(key+":"+hMap.get(key));
    	}
    	Set<java.util.Map.Entry<String, String>> entries =  hMap.entrySet();
    	for(java.util.Map.Entry<String, String> entry: entries) {
    		System.out.println(entry.getKey()+":"+entry.getValue());
    	}
        // END

        // TODO: 값이 4567인 사람의 이름은?
      	for(java.util.Map.Entry<String, String> entry: entries) {
      		if(entry.getValue().equals("011-5678"))
      			System.out.println(entry.getKey()+":"+entry.getValue());
    	}
        // END
    }

    private void removeMethod() {
        // TODO: andy의 자료를 삭제하고 출력하시오.
    	System.out.println(hMap.remove("andy"));
    	System.out.println(hMap.remove("hong"));
        // END
    }

    public static void main(String[] args) {
        MapTest hmt = new MapTest();
        hmt.addMethod();
        hmt.retrieveMethod();
        hmt.removeMethod();
    }
}
