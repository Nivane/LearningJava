package thisisnobody.exception.badfinally;

/**
 * 
 * @author ZLP finally�е�return���������쳣��Ϣ�޷����
 */
public class AllSilencer {

	@SuppressWarnings("finally")
	public static void main(String[] args) {

//		throw new RuntimeException();  //����쳣��Ϣ
		try {
			throw new RuntimeException();
		} finally {
			return;//�����쳣��Ϣδ���
		}
	}
}
