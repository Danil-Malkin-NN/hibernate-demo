package ru.present.hibernatedemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.repository.HomeRepository;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeRepository homeRepository;

    public Home saveHome(Home home) {
        return homeRepository.save(home);
    }

    public Home findById(Long id) {
        return homeRepository.getById(id);
    }
}
