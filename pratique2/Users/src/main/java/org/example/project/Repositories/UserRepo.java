package org.example.project.Repositories;

import org.example.project.dto.UserDtoResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<UserDtoResponse,Long> {

}
