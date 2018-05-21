package tr.com.altpro.jsondb.repository;

import org.springframework.data.repository.CrudRepository;
import tr.com.altpro.jsondb.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {


}
