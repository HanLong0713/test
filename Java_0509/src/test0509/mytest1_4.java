package test0509;
/*instanceof 為了開發出可擴充的程式 */

class Animal{
	public void move(){
		System.out.println("移動...");
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("跑跑跳跳...");
	}
	public void skill(){
		System.out.println("洗澡");
	}
}
class Bird extends Animal{
	public void move(){
		System.out.println("飛行...");
	}
}
class Tiger extends Cat{
	public void skill(){
		System.out.println("咬");
	}
}

class A{
	static String name="A";
	
}

public class mytest1_4 {
	public static void main(String[] args){
		Tiger t = new Tiger();
		t.skill();
		t.move();
		
		Cat c = new Cat();
		c.skill();
		c.move();
		
		Cat c2 = new Tiger();
		c2.skill(); //以Cat的規格呼叫skill 但實體為tiger
		c2.move();
		
		Animal a = new Tiger();
		a.move();
		//a.skill(); 因為animal規格中沒有skill 所以不可以
		//可以暫時改變資料型別
		((Tiger)a).skill();
		((Cat)a).skill();
		//((Bird)a).move(); 會出現java.lang.ClassCastException的錯誤，用bird來實現tiger實體不合邏輯
		// animal -> tiger -> bird , animal -> bird 兩個毫無相關
		/**預防機制 instanceof **/
	    if(a instanceof Bird){
	    	((Bird)a).move();
	    }else{
	    	System.out.println("物件變數無參考到該類別的物件實體，因此不可轉型");
	    }
	}
}
