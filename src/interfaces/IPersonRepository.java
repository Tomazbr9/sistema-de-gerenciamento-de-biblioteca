package interfaces;

import java.util.List;

public interface IPersonRepository<T> {
    void add(T person);
    
    List<T> list();
}

