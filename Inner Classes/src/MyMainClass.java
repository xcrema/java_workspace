
public class MyMainClass {
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.print(myOuter.x + myInner.y);
	}
}
