package sk.dominika;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabazovyAutobusDaoTest {
    @Test
    public void test() {
        int pocetRiadkov = DaoFactory.INSTANCE.getJdbcTemplate().queryForInt("SELECT COUNT(*) FROM Autobus");
        
        assertEquals(2, pocetRiadkov);
    }
    
    @Test
    public void testDajVsetky() {
        AutobusDao autobusDao = DaoFactory.INSTANCE.getAutobusDao();
        List<Autobus> zoznam = autobusDao.dajVsetky();
        
        assertEquals(2, zoznam.size());
    }
}
