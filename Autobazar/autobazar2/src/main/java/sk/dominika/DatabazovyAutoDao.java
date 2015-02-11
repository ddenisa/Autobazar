package sk.dominika;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class DatabazovyAutoDao implements AutoDao {

    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    BeanPropertyRowMapper<Auto> mapovac = new BeanPropertyRowMapper<>(Auto.class);

    public DatabazovyAutoDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Auto> dajVsetky() {
        return jdbcTemplate.query("SELECT * FROM Auto", mapovac);
    }

    @Override
    public void save(Auto auto) {
        if (auto.getID() == -1) {
            Map<String, Object> hodnoty = new HashMap<String, Object>();
            hodnoty.put("znacka", auto.getZnacka());
            hodnoty.put("model", auto.getModel());
            hodnoty.put("palivo", auto.getPalivo());
            hodnoty.put("rokVyroby", auto.getRokVyroby());
            hodnoty.put("najazdeneKm", auto.getNajazdeneKm());
            hodnoty.put("objemMotora", auto.getObjemMotora());
            hodnoty.put("farba", auto.getFarba());
            hodnoty.put("cena", auto.getCena());
            hodnoty.put("abs", auto.isAbs());
            hodnoty.put("parkovaciaKamera", auto.isParkovaciaKamera());
            hodnoty.put("radio", auto.isRadio());
            hodnoty.put("tempomat", auto.isTempomat());
            hodnoty.put("klimatizacia", auto.isKlimatizacia());
            hodnoty.put("tazneZariadenie", auto.isTazneZariadenie());

            SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);

            insert.setGeneratedKeyName("id");

            insert.setTableName("Auto");
            Number id = insert.executeAndReturnKey(hodnoty);
            auto.setID(id.intValue());
        } else {
            String string = "UPDATE Auto\n"
                    + "SET znacka = ?,\n"
                    + "model = ?,\n"
                    + "palivo = ?,\n"
                    + "rokVyroby = ?,\n"
                    + "najazdeneKm = ?,\n"
                    + "objemMotora = ?,\n"
                    + "farba = ?,\n"
                    + "cena = ?,\n"
                    + "abs = ?,\n"
                    + "parkovaciaKamera = ?,\n"
                    + "radio = ?,\n"
                    + "tempomat = ?,\n"
                    + "klimatizacia = ?,\n"
                    + "tazneZariadenie = ?\n"
                    + "WHERE id = ?";
            jdbcTemplate.update(string,
                    auto.getZnacka(),
                    auto.getModel(),
                    auto.getPalivo(),
                    auto.getRokVyroby(),
                    auto.getNajazdeneKm(),
                    auto.getObjemMotora(),
                    auto.getFarba(),
                    auto.getCena(),
                    auto.isAbs(),
                    auto.isParkovaciaKamera(),
                    auto.isRadio(),
                    auto.isTempomat(),
                    auto.isKlimatizacia(),
                    auto.isTazneZariadenie(),
                    auto.getID());
        }

    }

    @Override
    public void odstran(Auto auto) {
        jdbcTemplate.update("DELETE FROM Auto WHERE id = ?", auto.getID());
    }
    

    @Override
    public List<Auto> hladajPodlaId(int id) {
        return jdbcTemplate.query("select * from Auto where id like ?", mapovac, id);
    }
    
    
}
