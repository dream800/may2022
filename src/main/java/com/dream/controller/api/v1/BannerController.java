package com.dream.controller.api.v1;

import com.dream.dto.PersonDTO;
import com.dream.exception.http.NotFoundException;
import com.dream.model.Banner;
import com.dream.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping("/name")
    public String getName(@RequestBody @Valid PersonDTO person) {
//        Banner banner = bannerService.getByName(name);
//        if(name != null){
//            throw new NotFoundException(30005);
//        }
//
//        return banner;
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//        PersonDTO haha = PersonDTO.builder().name("haha").age(10).build();

//        System.out.println(name);
//        System.out.println(test);[

        return "success";
    }

    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable @NotBlank String name) {
        Banner banner = bannerService.getByName(name);
        System.out.println(banner);
        if(banner == null){
            throw new NotFoundException(30005);
        }

        return banner;
    }


}


