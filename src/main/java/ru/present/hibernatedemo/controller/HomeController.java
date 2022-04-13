package ru.present.hibernatedemo.controller;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.present.hibernatedemo.dto.HomeDto;
import ru.present.hibernatedemo.entity.Home;
import ru.present.hibernatedemo.mapper.HomeMapper;
import ru.present.hibernatedemo.service.HomeService;

@RestController
@RequiredArgsConstructor
@Slf4j
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

    @GetMapping("get/home/all")
    public Set<HomeDto> getHome() {
        List<Home> homes = homeService.findAll();
        log.info("All request for findAll");

        return homes.stream().map(homeMapper::homeToHomeDto).collect(Collectors.toSet());
    }

}
