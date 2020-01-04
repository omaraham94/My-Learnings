package com.myproject.learningspringboot.dao;

import com.myproject.learningspringboot.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class SampleDao implements UserDao {
    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public Optional<User> selectUserByUserUid(UUID userUid) {
        return Optional.empty();
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserByUserUid(UUID userUid) {
        return 0;
    }

    @Override
    public int insertUser(UUID userUid, User user) {
        return 0;
    }
}
