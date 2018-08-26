package com.colorfx.colorfx.controller;

import com.colorfx.colorfx.dto.ColorPair;
import com.colorfx.colorfx.service.FxColorService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/color")
public class ColorController {

    @Autowired
    private FxColorService fxColorService;

    @RequestMapping(value = "colorPair")
    @CrossOrigin
    public ColorPair getColorPair(@RequestParam("colorPairCode") Integer colorPairCode, HttpResponse response) {
        ColorPair colorPair = this.fxColorService.getColorPairByCode(colorPairCode);
        return colorPair;
    }
}
