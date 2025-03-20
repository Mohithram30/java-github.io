package test.mymathoperinterfaces;

public class OperMainClass {

	public OperMainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MaothOper1 intAddition=new MathOperClass(100,200);//OracleVendorClass
		MaothOper1 stringAddition=new StringOperClass("A","C");//MySqlVendorClass
		
		intAddition.add();
		intAddition.sub();
		
		stringAddition.add();
		stringAddition.sub();

	}

}
