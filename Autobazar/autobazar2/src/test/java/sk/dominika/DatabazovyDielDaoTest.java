package sk.dominika;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabazovyDielDaoTest {
    @Test
    public void test() {
        int pocetRiadkov = DaoFactory.INSTANCE.getJdbcTemplate().queryForInt("SELECT COUNT(*) FROM nahradnyDiel");
        
        assertEquals(3, pocetRiadkov);
    }
    
    @Test
    public void testDajVsetky() {
        DielDao dielDao = DaoFactory.INSTANCE.getDielDao();
        List<Diel> zoznam = dielDao.dajVsetky();
        
        assertEquals(3, zoznam.size());
    }
}
