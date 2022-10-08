package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		//Değer tip örneği
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;

		System.out.println(sayi1);
		
		//Referans tip örneği
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {10,20,30};
		
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		
		//Class örnekleri
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer(); //örneğini oluşturmak, instance oluşturmak, instance cration
		customer.setId(1);
		customer.setCity("Ankara");
		
		
		
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.save();
		customerManager.delete();
		customerManager.giveCredit();
		
		
//		Company company = new Company();
//		company.setTaxNumber("100000");
//		company.setCompanyName("Arçelik");
//		company.setId(100);
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		
//		
//		Person person = new Person();
//		person.setFirstName("");
//		person.setNationalIdentity("");
//		
//		Customer customer1 = new Customer();
//		Customer customer2 = new Person();
//		Customer customer3 = new Company();
		
		
	}

}
