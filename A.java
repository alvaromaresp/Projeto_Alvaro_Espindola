public class A{
	private int A1;
	private float A2;

	public int getA1(){
		return A1;
	}

	public int setA1(int A1){
		this.A1 = A1;
	}

	public int getA2(){
		return A2;
	}

	public int setA2(int A2){
		this.A2 = A2;
	}

	public void MA1(){
		System.out.println("MA1");
	}

	public void MA2(){
		System.out.println("MA2");
	}

	public void MA3(){
		System.out.println("Alteração na classe A a partir do clone");
	}

}
