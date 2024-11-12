package com.nodo.microservicies.ms_user.persistence;

import com.nodo.microservicies.ms_user.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {
}
