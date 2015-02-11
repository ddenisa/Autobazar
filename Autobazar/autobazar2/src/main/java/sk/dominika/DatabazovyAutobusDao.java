package sk.dominika;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class DatabazovyAutobusDao implements AutobusDao {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    BeanPropertyRowMapper<Autobus> mapovac = new BeanPropertyRowMapper<>(Autobus.class);

    public DatabazovyAutobusDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Autobus> dajVsetky() {
        return jdbcTemplate.query("SELECT * FROM Autobus", mapovac);
    }

    @Override
    public void save(Autobus autobus) {
        if (autobus.getID() == -1) {
            Map<String, Object> hodnoty = new HashMap<String, Object>();
            hodnoty.put("druh", autobus.getDruh());
            hodnoty.put("znacka", autobus.getZnacka());
            hodnoty.put("model", autobus.getModel());
            hodnoty.put("rokVyroby",autobus.getRokVyroby());
            hodnoty.put("najazdeneKm", autobus.getNajazdeneKm());
            hodnoty.put("cena", autobus.getCena());

            SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);

            insert.setGeneratedKeyName("id");

            insert.setTableName("Autobus");
            Number id = insert.executeAndReturnKey(hodnoty);
            autobus.setID(id.intValue());
        } else {
            
        }
    }

    @Override
    public void odstran(Autobus autobus) {
        jdbcTemplate.update("DELETE FROM Autobus WHERE id = ?",
                autobus.getID());
    }
    
    public List<Autobus> hladajPodlaId(int id){
        return jdbcTemplate.query("select * from Autobus where id like ?", mapovac, id);
    }

}
