package Tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.gtm.Employes.metier.EmployeeSalesman;

public class testsEmployeeSalesman {

	@Test
	public void test() {
		EmployeeSalesman es = new EmployeeSalesman("ZIEGLER", "Régine", 50, new Date(),100);
		assertEquals(420, es.calculateSalary(), 0.001);
	}
}
