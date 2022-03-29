package repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    T save(T t);
    List<T> findAll();


}
