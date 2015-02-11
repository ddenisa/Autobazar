package sk.dominika;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabazovyMotorkaDaoTest {
    @Test
    public void test() {
        int pocetRiadkov = DaoFactory.INSTANCE.getJdbcTemplate().queryForInt("SELECT COUNT(*) FROM Motorka");
        
        assertEquals(2, pocetRiadkov);
    }
    
    @Test
    public void testDajVsetky() {
        MotorkaDao motorkaDao = DaoFactory.INSTANCE.getMotorkaDao();
        List<Motorka> zoznam = motorkaDao.dajVsetky();
        
        assertEquals(2, zoznam.size());
    }
}
