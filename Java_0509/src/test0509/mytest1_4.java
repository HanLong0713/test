package test0509;
/*instanceof ���F�}�o�X�i�X�R���{�� */

class Animal{
	public void move(){
		System.out.println("����...");
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("�]�]����...");
	}
	public void skill(){
		System.out.println("�~��");
	}
}
class Bird extends Animal{
	public void move(){
		System.out.println("����...");
	}
}
class Tiger extends Cat{
	public void skill(){
		System.out.println("�r");
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
		c2.skill(); //�HCat���W��I�sskill �����鬰tiger
		c2.move();
		
		Animal a = new Tiger();
		a.move();
		//a.skill(); �]��animal�W�椤�S��skill �ҥH���i�H
		//�i�H�Ȯɧ��ܸ�ƫ��O
		((Tiger)a).skill();
		((Cat)a).skill();
		//((Bird)a).move(); �|�X�{java.lang.ClassCastException�����~�A��bird�ӹ�{tiger���餣�X�޿�
		// animal -> tiger -> bird , animal -> bird ��Ӳ@�L����
		/**�w������ instanceof **/
	    if(a instanceof Bird){
	    	((Bird)a).move();
	    }else{
	    	System.out.println("�����ܼƵL�ѦҨ�����O���������A�]�����i�૬");
	    }
	}
}
