package tr.com.altpro.jsondb.boundary;

import org.springframework.stereotype.Service;
import tr.com.altpro.jsondb.entity.User;
import tr.com.altpro.jsondb.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }
}
