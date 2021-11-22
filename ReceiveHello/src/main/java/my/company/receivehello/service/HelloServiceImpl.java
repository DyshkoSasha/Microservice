package my.company.receivehello.service;

import lombok.RequiredArgsConstructor;
import my.company.receivehello.model.Hello;
import my.company.receivehello.repository.HelloRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;

    @Override
    public void saveHello(Hello hello) {
        helloRepository.save(hello);
    }

    @Override
    public Long getCount() {
        return helloRepository.count();
    }
}
