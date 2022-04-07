package myLibrary;

public class MyCalculator {
	//CalcSum
	public Calculator calcSum(Calculator c) {
		 c.setNum3(c.getNum1()+c.getNum2());
		 return c;
	}
	
	//CalcSub
	public Calculator calcSub(Calculator c) {
		 c.setNum3(c.getNum1()-c.getNum2());
		 return c;
	}
	
	//CalcPrd
	public Calculator calcPrd(Calculator c) {
		 c.setNum3(c.getNum1()*c.getNum2());
		 return c;
	}
	
	//CalcDiv
	public Calculator calcDiv(Calculator c) {
		 c.setNum3(c.getNum1()/c.getNum2());
		 return c;
	}
	
	//CalcRem
	public Calculator calcRem(Calculator c) {
		 c.setNum3(c.getNum1()%c.getNum2());
		 return c;
	}
	
	//CalcPow()
	public Calculator calcPow(Calculator c) {
		 c.setNum3((int)Math.pow(c.getNum1(), c.getNum2()));
		 return c;
	}
	
}
