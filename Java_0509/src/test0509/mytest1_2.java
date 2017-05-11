package test0509;

class Father{
	void amethod(){
		System.out.println("call father method");
	}
}
public class mytest1_2 extends Father{
	public static void main(String[] args){
		mytest1_2 nn = new mytest1_2();
		nn.amethod();
	}
	void amethod(){
		System.out.println("call son");
	}
}
class Skill{};
class AdvSkill extends Skill{}
class Ani2{
	Skill skl;
	public Skill getSkill(){
		skl = new Skill();
		return skl;
	}
	
	public class Dog extends Ani2{
		AdvSkill Askl;
		public Skill getSkill(){
			Askl = new AdvSkill();
			return Askl;
		}
	}
} 


