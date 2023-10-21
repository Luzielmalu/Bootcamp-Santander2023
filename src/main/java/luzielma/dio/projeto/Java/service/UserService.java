package luzielma.dio.projeto.Java.service;

import luzielma.dio.projeto.Java.modeloAp.User;

public interface UserService {
    
    User findById(Long id);

    User create(User userToCreate);

}
