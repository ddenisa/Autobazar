
package sk.dominika;

import java.util.List;

public interface AutobusDao {

    List<Autobus> dajVsetky();

    void save(Autobus autobus);

    public void odstran(Autobus autobus);
    
     List<Autobus> hladajPodlaId(int id);

}