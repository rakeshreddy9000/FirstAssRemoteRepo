class Emp
{
	String name;
	int age;
	int salary;
	String designation;
	
	Emp(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void raiseSalary()
	{
		salary+=2000;
	}

	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Designation:"+designation);
		System.out.println();
	}
}
class Tester extends Emp
{
	Tester(String name,int age)
	{
		super(name,age);
		salary=15000;
		designation="Tester";
	}
}
class Programmer extends Emp
{
	Programmer(String name,int age)
	{
		super(name,age);
		salary=30000;
		designation="Programmer";
	}
	public void raiseSalary()
	{
		salary+=5000;
	}
}
class Manager extends Emp
{
	Manager(String name,int age)
	{
		super(name,age);
		salary=90000;
		designation="Manager";
	}
	public void raiseSalary()
	{
		salary+=10000;
	}
}
public class EmpMain
{
	public static void main(String args[])
	{
		Emp e1=new Tester("ravi",25);
		Emp e2=new Programmer("prabhu",33);
		Emp e3=new Manager("mamta",45);

		e1.display();
		e2.display();
		e3.display();
		
		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();

		e1.display();
		e2.display();
		e3.display();


	}
}
		