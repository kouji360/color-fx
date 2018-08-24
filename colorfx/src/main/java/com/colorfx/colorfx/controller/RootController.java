package com.colorfx.colorfx.controller;

import com.colorfx.colorfx.data.FxColor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RootController {

    @RequestMapping(value="color")
    @ResponseBody
    public ResponseEntity<String> aVoid(){
        FxColor color =  new FxColor();
        return null;
    }

}
