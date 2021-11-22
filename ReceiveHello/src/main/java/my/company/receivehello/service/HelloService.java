package my.company.receivehello.service;

import my.company.receivehello.model.Hello;

public interface HelloService {
    void saveHello(Hello hello);

    Long getCount();
}
