package ch07;

// TODO: SmartPhone이 다른 SmartPhone과 번호를 기준으로 비교가능하게 처리하시오.
 public class SmartPhone implements Comparable<SmartPhone>{
	@Override
	public int compareTo(SmartPhone o) {
		//5 1 비교하면 양수나옴 오름차순일때 바
		//양수 -> 방향 전환
		//0 -> 유지 (같음)
		//음 -> 유지
//		return this.number.compareTo(o.number);
		return this.number.compareTo(o.number)*-1; //오름차순
	}
    // END

    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    public String toString() {
        return "전화 번호: " + number;
    }

    // TODO: 동일한 번호의 SmartPhone이면 하나만 추가될 수 있도록 처리하시오.
   @Override
	public boolean equals(Object obj) {
	   if(obj !=null && obj instanceof SmartPhone) {
		   SmartPhone sp = (SmartPhone) obj;
		   return sp.number.equals(this.number);
	   }
		return false;
	}
   @Override
	public int hashCode() {
		return this.number.hashCode();
		
	}
    // END

}
