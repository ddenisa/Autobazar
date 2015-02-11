package sk.dominika;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class DatabazovyMotorkaDao implements MotorkaDao {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    BeanPropertyRowMapper<Motorka> mapovac = new BeanPropertyRowMapper<>(Motorka.class);

    public DatabazovyMotorkaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Motorka> dajVsetky() {
        return jdbcTemplate.query("SELECT * FROM Motorka", mapovac);
    }

    @Override
    public void save(Motorka motorka) {
        if (motorka.getID() == -1) {
            Map<String, Object> hodnoty = new HashMap<String, Object>();
            hodnoty.put("druh", motorka.getDruh());
            hodnoty.put("znacka", motorka.getZnacka());
            hodnoty.put("model", motorka.getModel());
            hodnoty.put("rokVyroby", motorka.getRokVyroby());
            hodnoty.put("najazdeneKm", motorka.getNajazdeneKm());
            hodnoty.put("cena", motorka.getCena());

            SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);

            insert.setGeneratedKeyName("id");

            insert.setTableName("Motorka");
            Number id = insert.executeAndReturnKey(hodnoty);
            motorka.setID(id.intValue());
        } else {
            
        }
    }

    @Override
    public void odstran(Motorka motorka) {
        jdbcTemplate.update("DELETE FROM Motorka WHERE id = ?",
                motorka.getID());
    }
    
    public List<Motorka> hladajPodlaId(int id){
        return jdbcTemplate.query("select * from Motorka where id like ?", mapovac, id);
    }

}
