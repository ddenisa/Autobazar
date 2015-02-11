package sk.dominika;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabazovyAutoDaoTest {
    @Test
    public void test() {
        int pocetRiadkov = DaoFactory.INSTANCE.getJdbcTemplate().queryForInt("SELECT COUNT(*) FROM Auto");
        
        assertEquals(11, pocetRiadkov);
    }
    
    @Test
    public void dajVsetkyTest() {
        AutoDao autoDao = DaoFactory.INSTANCE.getAutoDao();
        List<Auto> zoznam = autoDao.dajVsetky();
        
        assertEquals(11, zoznam.size());
    }
}
