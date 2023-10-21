package luzielma.dio.projeto.Java.modeloAp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luzielma.dio.projeto.Java.modeloAp.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}