// Sınıf adı bir şaka. Bu notları vim kullanarak yazıyorum Vi improved.
// bu sınıf ise adt improved manasında adtim isimli
// yani bu özel bir terim değil sadece kötü bir şaka 


public class Adtim{
	
	public static void main(String[] args){
		System.out.println("test");	
		}
	}




class Worker{
	// final sayesinde ona constructorda bir değer vereceğiz ve hep böyle kalacak.
	// Değişemez bir değer
	final int id;
	final String name;
	final String lastName;
	// private is gizli demek. Buna birworkerobjesi.salary 
	// ifadesi ile ulaşamayız bu yüzden getter ve setter methodları yazacağız
	private int salary;

	public Worker(int id, String name, String lastName, int salary){
		this.id=id;
		this.name=name;
		this.lastName=lastName;
		this.salary=salary;
	}
	}
