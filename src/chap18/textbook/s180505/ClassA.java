package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable {
	static final long serialVersionUTD = 1L;	//serial 버전을 확인하기위한 정보
	
	int field1;	// 직렬화는 int 필드만 가능
	ClassB field2 = new ClassB();
	static int field3;	//static 필드는 직렬화가 안됨
	transient int field4; // transient 필드는 직렬화 안됨
	
}
