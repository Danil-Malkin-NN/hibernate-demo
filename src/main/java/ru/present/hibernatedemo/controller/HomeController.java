package ru.present.hibernatedemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.present.hibernatedemo.dto.HomeDto;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.mapper.HomeMapper;
import ru.present.hibernatedemo.service.HomeService;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @Autowired
    HomeMapper homeMapper;

    @PostMapping("save/home")
    public HomeDto saveHome(@RequestBody Home home) {
        return homeMapper.homeToHomeDto(homeService.saveHome(home));
    }

    @GetMapping("get/home/{id}")
    public HomeDto getHome(@PathVariable(name = "id") Long id) {
        return homeMapper.homeToHomeDto(homeService.findById(id));
    }

    @GetMapping("sample/home")
    public Home getStub() {
        return new Home();
    }

}
