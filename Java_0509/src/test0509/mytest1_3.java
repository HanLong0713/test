package test0509;

public class mytest1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Son s = new Son(); �|��ܨS���ŧi����
		class Father{
			Father(char c){
				System.out.println("Father call : "+c);
			}
		}
		class Son extends Father{
			Son() {
				super('a');
				System.out.println("Son call : ");
			}
		}
		/*--------�U�ҥi�H�ݥX Son2�|���I�ssuper() �]���|���I�s����-------*/
		class Father2{
			Father2(){
				System.out.println("Father call : ");
			}
		}
		class Son2 extends Father2{
			Son2() {
				this(4);//�I�s��Son2(int i)
				System.out.println("Son call : ");
			}
			Son2(int i){
				System.out.println("Son call : "+i);
			}
		}
		Son s = new Son();
		Son2 s2 = new Son2();
	}

}
