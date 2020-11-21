package com.fsk.issuemanagement.services.implementations;

import com.fsk.issuemanagement.entities.User;
import com.fsk.issuemanagement.repositories.UserRepository;
import com.fsk.issuemanagement.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        if(user.getEmail() == null){
            throw new IllegalArgumentException("Username cannot be null");
        }

        user = userRepository.save(user);
        return user;
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
