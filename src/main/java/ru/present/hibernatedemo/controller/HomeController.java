package ru.present.hibernatedemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.service.HomeService;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    public Home saveHome(@RequestBody Home home) {
        return homeService.saveHome(home);
    }

    public Home getHome(@RequestParam(name = "id") Long id){
        return homeService.findById(id);
    }


}
