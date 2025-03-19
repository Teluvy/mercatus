package com.marketplace.mercatus.user.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false) // username должен быть уникальным и не null
    private String username;

    @Column(nullable = false) // Пароль обязателен
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // Роль тоже обязательна
    private UserRole role;
}
