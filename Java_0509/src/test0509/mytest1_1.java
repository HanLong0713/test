package test0509;

public class mytest1_1 {
	void avoid(){
		bvoid();
		dvoid();
	}
	void bvoid(){}
    static void cvoid(){
    	//bvoid();static ���i�����s��non-static
    	dvoid();
    }
    static void dvoid(){
    	new mytest1_1().bvoid(); //�����ŧi�P�Ы�object�~�i�s��
    }
}
/**why?�bavoid�I�sbvoid(non-static)�O�z�Lthis�ѳy ��static�èS��this�ѷ�(���Ϋإߪ���)**/ 