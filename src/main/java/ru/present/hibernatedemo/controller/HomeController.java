package ru.present.hibernatedemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

    @DeleteMapping("delete/home/{id}")
    public boolean deleteHome(@PathVariable(name = "id") Long id) {
        try {
            homeService.delete(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @GetMapping("sample/home")
    public Home getStub() {
        return new Home();
    }

}
