package interfaces;

import java.util.List;

public interface IPerson<T> {
    void add(T person);
    
    List<T> list();
}

