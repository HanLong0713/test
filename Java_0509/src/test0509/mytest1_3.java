package test0509;

public class mytest1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Son s = new Son(); 會顯示沒有宣告實體
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
		/*--------下例可以看出 Son2會先呼叫super() 因此會先呼叫父類-------*/
		class Father2{
			Father2(){
				System.out.println("Father call : ");
			}
		}
		class Son2 extends Father2{
			Son2() {
				this(4);//呼叫到Son2(int i)
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
