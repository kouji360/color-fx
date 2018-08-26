package com.colorfx.colorfx.dao;

import com.colorfx.colorfx.dto.ColorPair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColorPairDao extends JpaRepository<ColorPair, Integer> {
    List<ColorPair> findByCode(Integer code);
}
