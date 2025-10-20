package SpringBoot.sample.service;


import SpringBoot.sample.models.User;
import SpringBoot.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userrepo;

    public User createUser(User User)
    {
        return userrepo.save(User);
    }

    
    public User getUserById(Long id)
    {
        return userrepo.findById(id).orElseThrow(() -> new RuntimeException("User not found!"));
    }


}
