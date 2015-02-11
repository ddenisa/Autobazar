package sk.dominika;

import java.util.List;

public interface DielDao {

    List<Diel> dajVsetky();

    void save(Diel diel);

    public void odstran(Diel diel);

}
