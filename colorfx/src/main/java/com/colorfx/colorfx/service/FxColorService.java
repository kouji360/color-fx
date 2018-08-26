package com.colorfx.colorfx.service;

import com.colorfx.colorfx.dao.ColorPairDao;
import com.colorfx.colorfx.data.FxColorPair;
import com.colorfx.colorfx.dto.ColorPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FxColorService {

    @Autowired
    private ColorPairDao colorPairDao;

    private Map<Integer, FxColorPair> colorPairMap;

    public ColorPair getColorPairByCode(Integer colorPairCode) {
        return colorPairDao.findByCode(colorPairCode).stream().findFirst().get();
    }
}
