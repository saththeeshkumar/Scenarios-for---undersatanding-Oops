package Oops;

public class SQLTrainer extends Trainer {

	
	public static void main(String[] args) {
   SQLTrainer ram = new SQLTrainer();
  System.out.println(ram.dept);
  System.out.println(ram.institute);
  ram.training();
  System.out.println("private variable salary value is " + ram.getSalary());
	}

}
