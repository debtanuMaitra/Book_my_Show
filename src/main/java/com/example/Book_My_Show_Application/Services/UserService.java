package com.example.Book_My_Show_Application.Services;

import com.example.Book_My_Show_Application.Entities.UserEntity;
import com.example.Book_My_Show_Application.EntryDtos.UserEntryDto;
import com.example.Book_My_Show_Application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto) {
        //Here we need to convert and save
        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName())
                .address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).build();
        //This is to set all the attributes in one go

        userRepository.save(userEntity);
    }
}
