package SpringCoreAutowireAtc.com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class AppConfig { 
	

	@Bean("nikhil")
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		
		emp.setEmpid(101);
		emp.setEmpname("nikhil");
		
		return emp;
	}
	
	@Bean("add")
	public Address getAddress()
	{
		Address add = new Address();
		add.setColony("New Colony");
		add.setDstrct("Jaipur");
		add.setState("Rajasthan");
		add.setHonum(15);
		return add;
	}

}