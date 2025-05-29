package com.example.app.service;

import com.example.app.entity.User;
import com.example.app.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    @Test
    void testGetAllUsers() {
        List<User> mockUsers = List.of(new User());
        when(repository.findAll()).thenReturn(mockUsers);

        List<User> users = service.getAllUsers();

        assertEquals(1, users.size());
        verify(repository).findAll();
    }
}

