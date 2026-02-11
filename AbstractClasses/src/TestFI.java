import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestFI {

	public static void main(String[] args) throws CloneNotSupportedException {
		
			
		Bank b1 = new Bank("My Bank");
		
		System.out.println("MyBank interest rate: " + b1.getInterestRate() * 100 + "%");
		
		List<FinancialInstitution> fiList = new LinkedList<>();
		
		fiList.add(b1);
		fiList.add(new CreditUnion("My CU"));
		fiList.add(new NonLender("Useless FI"));
		
		fiList.get(0).setFiId(2);
		fiList.get(1).setFiId(3);
		fiList.get(2).setFiId(1);
		
		
		if(fiList.get(0) instanceof Bank) {
			((Bank)fiList.get(0)).setSavings();
		}
		
		
		Collections.sort(fiList, Collections.reverseOrder());
		
		for(FinancialInstitution fi: fiList) {
			System.out.println(fi);
		}
		
		b1.setAddress(new Address());
		b1.getAddress().street = "555 Merry Way";
		
		FinancialInstitution b2 = null;
		if(b1 instanceof Cloneable) {
			b2 = b1.clone();
		}
		
		b2.setFiId(4);
		b2.setFiName("Cloned Bank");
		b2.getAddress().street = "666 Spoopy St";
		
		System.out.println(b1 + " " + b1.getAddress().street);
		System.out.println(b2 + " " + b2.getAddress().street);
		
		
		
	
		
	}
}
