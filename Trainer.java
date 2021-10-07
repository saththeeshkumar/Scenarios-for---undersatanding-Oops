package Oops;

public class Trainer {
	
String dept = "Java", institute = "Payilagam" ;
int salary = 10000;

Trainer()
{
  this("CSE","Payilagam");
}

Trainer(String dept,String institute)
{
	this.dept = dept;
	this.institute = institute;
}

public static void main(String[] args) {
	Trainer trainerkumar = new Trainer("CSE","Payilagam");
}

public int getSalary()
{
return this.salary;
}

void training()
{
	System.out.println("training method in Trainer class");
}
	
}
