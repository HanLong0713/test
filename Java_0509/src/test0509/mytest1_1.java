package test0509;

public class mytest1_1 {
	void avoid(){
		bvoid();
		dvoid();
	}
	void bvoid(){}
    static void cvoid(){
    	//bvoid();static 不可直接存取non-static
    	dvoid();
    }
    static void dvoid(){
    	new mytest1_1().bvoid(); //必須宣告與創建object才可存取
    }
}
/**why?在avoid呼叫bvoid(non-static)是透過this參造 而static並沒有this參照(不用建立物件)**/ 