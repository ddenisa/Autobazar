package sk.dominika;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class DatabazovyDielDao implements DielDao {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    BeanPropertyRowMapper<Diel> mapovac = new BeanPropertyRowMapper<>(Diel.class);

    public DatabazovyDielDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Diel> dajVsetky() {
        return jdbcTemplate.query("SELECT * FROM nahradnyDiel", mapovac);
    }

    @Override
    public void save(Diel diel) {
        if (diel.getID() == -1) {
            Map<String, Object> hodnoty = new HashMap<String, Object>();
            hodnoty.put("druh", diel.getDruh());
            hodnoty.put("podkategoria", diel.getPodkategoria());
            hodnoty.put("cena", diel.getCena());

            SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);

            insert.setGeneratedKeyName("id");

            insert.setTableName("nahradnyDiel");
            Number id = insert.executeAndReturnKey(hodnoty);
            diel.setID(id.intValue());
        } else {
            String string = "UPDATE nahradnyDiel\n,"
                    + "SET druh = ?,\n"
                    + "podkategoria = ?,\n"
                    + "cena = ?,\n"
                    + "WHERE id = ?";
            jdbcTemplate.update(string,
                    diel.getDruh(),
                    diel.getPodkategoria(),
                    diel.getCena(),
                    diel.getID());
        }
    }

    @Override
    public void odstran(Diel diel) {
        jdbcTemplate.update("DELETE FROM nahradnyDiel WHERE id = ?", diel.getID());
    }

}
