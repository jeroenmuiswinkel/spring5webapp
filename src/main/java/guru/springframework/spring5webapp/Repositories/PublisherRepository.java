package guru.springframework.spring5webapp.Repositories;

import guru.springframework.spring5webapp.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
