package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tl on 7/9/2018
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
