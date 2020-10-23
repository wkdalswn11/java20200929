package chap06.lecture.annotation;
@MyAnnotation
//@Override
public class AnnotationEx1 {
	@MyAnnotation
	private int i;
	// 주석들....
	
	// annotation
	
	@Override
	@MyAnnotation
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@MyAnnotation(value="abc", number=5, names={"c","d"}) //'value=' 생략가능  여러값을 넣을때는 생략불가능함
	public static void mymethod() {
		
	}
}
