package sk.dominika;

import java.util.List;

public interface MotorkaDao {

    List<Motorka> dajVsetky();

    void save(Motorka motorka);

    public void odstran(Motorka motorka);
    
     List<Motorka> hladajPodlaId(int id);

}
