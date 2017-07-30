package Tests;

import static org.junit.Assert.*;

import java.util.Date;


import org.junit.Test;

import com.gtm.Employes.metier.EmployeeProducer;

public class testsEmployeeProducer {

	@Test
	public void testNbrUnit() {
		EmployeeProducer ep = new EmployeeProducer("Vittu", "Olivier", 50, new Date(), 10);
		assertEquals(10, ep.getNbrUnit());
	}

	@Test
	public void testCalculateSalary() {
		EmployeeProducer ep = new EmployeeProducer("Vittu", "Olivier", 50, new Date(), 810);
		assertEquals(4050, ep.calculateSalary(), 0.001);
	}
}
