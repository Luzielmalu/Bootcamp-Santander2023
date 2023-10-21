package luzielma.dio.projeto.Java.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import luzielma.dio.projeto.Java.modeloAp.User;
import luzielma.dio.projeto.Java.modeloAp.repository.UserRepository;
import luzielma.dio.projeto.Java.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
        public UserServiceImpl(UserRepository userRepository){
            this.userRepository = userRepository;
        }

    @Override
    public User findById(Long id) {
        
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
         
       //if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
           // throw new IllegalArgumentException("Usuário já esxiste");
       //}
       //return null;
    //}
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("A conta já existe.");

        }
        return userRepository.save(userToCreate);
    }



}
