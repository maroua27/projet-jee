package org.example.project.dto;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.rest.core.config.Projection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")

@Projection(types = UserDtoResponse.class,name = "tp2")
public class UserDtoResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private  String email;



}