package com.example.pr24.services;

import com.example.pr24.dao.UserDAO;
import com.example.pr24.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * Возвращает пользователя по логину
     * @param username логин
     * @return данные пользователя
     */
    public User getUser(String username) {
        return userDAO.findByUsername(username);
    }

    /**
     * Создаёт новые или обновляет старые данные об пользователе
     * у которого id равен с university.id
     * @param user
     */
    public void save(User user) {
        userDAO.save(user);
    }
}
