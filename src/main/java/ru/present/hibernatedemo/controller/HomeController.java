package ru.present.hibernatedemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.service.HomeService;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @PostMapping("save/home")
    public Home saveHome(@RequestBody Home home) {
        return homeService.saveHome(home);
    }

    @GetMapping("get/home/{id}")
    public Home getHome(@PathVariable(name = "id") Long id) {
        return homeService.findById(id);
    }

    @GetMapping("sample/home")
    public Home getStub() {
        return new Home();
    }


}
