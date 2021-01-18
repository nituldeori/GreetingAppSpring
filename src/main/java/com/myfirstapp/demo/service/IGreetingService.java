package com.myfirstapp.demo.service;

import com.myfirstapp.demo.mode.Greeting;
import com.myfirstapp.demo.mode.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
