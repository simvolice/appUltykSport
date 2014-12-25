package org.growit.kz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.growit.kz.model.*;
import org.growit.kz.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 23.12.2014.
 */



@RestController
@RequestMapping("/data")
public class JsonController {

    private final MainService mainService;


    @Autowired
   public JsonController (MainService mainService) {

        this.mainService = mainService;

    }







    @RequestMapping(value = "/getArt", produces = {MediaType.APPLICATION_JSON_VALUE})

    public @ResponseBody
    ArticleEntity articleEntity(@RequestParam(value = "id",required = false,
            defaultValue = "0") Integer id) {


        ArticleEntity articleEntity = mainService.findByIdArticleEntity(id);





       return articleEntity;



    }



}
