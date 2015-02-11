package sk.dominika;

import java.util.List;

public interface AutoDao {

    List<Auto> dajVsetky();

    void save(Auto auto);
    
    void odstran(Auto auto);
    
     List<Auto> hladajPodlaId(int id);
    
}
