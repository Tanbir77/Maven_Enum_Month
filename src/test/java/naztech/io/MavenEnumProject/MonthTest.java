package naztech.io.MavenEnumProject;


import static org.junit.Assert.*;

import org.junit.Test;

public class MonthTest {
	@Test
	public void testPerse() {
		assertNull(Month.parse("JaNu"));
		assertNotNull(Month.parse("jan"));
		assertNotNull(Month.parse("january"));
	}

}
