// dosya adı ile aynı isimli bir public class

public class example1{
	public static void main(String[] args){
		System.out.println("Bu class example1");
	}}
// bir adet public class olacağı için bu class public değil
class example1sideclass{
	public static void main(String[] args){
		// class public olmasa da bu sınıf public çünkü dışarıdan çağrılabilir
	System.out.println("bu side class");}
}
