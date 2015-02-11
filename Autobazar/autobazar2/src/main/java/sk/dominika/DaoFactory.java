package sk.dominika;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {
    INSTANCE;
    
    AutoDao autoDao;
    DielDao dielDao;
    MotorkaDao motorkaDao;
    AutobusDao autobusDao;
    JdbcTemplate jdbcTemplate;
    MysqlDataSource dataSource;
    
    public AutoDao getAutoDao() {
        if (this.autoDao == null) {
            this.autoDao = new DatabazovyAutoDao(getJdbcTemplate());
        }
        return this.autoDao;
    }
    
    public DielDao getDielDao() {
        if (this.dielDao == null) {
            this.dielDao = new DatabazovyDielDao(getJdbcTemplate());
        }
        return this.dielDao;
    }
    public MotorkaDao getMotorkaDao() {
        if (this.motorkaDao == null) {
            this.motorkaDao = new DatabazovyMotorkaDao(getJdbcTemplate());
        }
        return this.motorkaDao;
    }
    
     public AutobusDao getAutobusDao() {
        if (this.autobusDao == null) {
            this.autobusDao = new DatabazovyAutobusDao(getJdbcTemplate());
        }
        return this.autobusDao;
    }
     

    public JdbcTemplate getJdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(getDataSource());
        }
        return this.jdbcTemplate;
    }

    private MysqlDataSource getDataSource() {
        if (this.dataSource == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://db4free.net:3306/auticka");
            dataSource.setUser("domka");
            dataSource.setPassword("auticka");
            this.dataSource = dataSource;
        }
        return this.dataSource;
    }
    
    
}
