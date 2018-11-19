package com.springboot.chapter212;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Binder binder = Binder.get(context.getEnvironment());

        User user = binder.bind("com.dingjust", Bindable.of(User.class)).get();
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());

        List<String> list = binder.bind("com.information.detail",Bindable.listOf(String.class)).get();
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        List<Information>  informations = binder.bind("com.information.details",Bindable.listOf(Information.class)).get();
        System.out.println(informations.get(0).getContent());
        System.out.println(informations.get(1).getContent());



    }
}
