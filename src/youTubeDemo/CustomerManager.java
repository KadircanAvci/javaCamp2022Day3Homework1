package youTubeDemo;

//Katmanlı Mimariler
public class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager baseCreditManager) {
		this._customer = customer;
		this._creditManager = baseCreditManager;
	}

	public void save() {

		System.out.println("Müşteri eklendi : ");
	}
 
	public void delete() {

		System.out.println("Müşteri silindi : ");
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
