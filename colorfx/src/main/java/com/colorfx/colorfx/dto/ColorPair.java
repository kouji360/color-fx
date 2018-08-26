package com.colorfx.colorfx.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "COLOR_PAIR")
@Data
public class ColorPair implements Serializable {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "code")
    private Integer code;
    @Column(name = "left_color_code")
    private Integer leftColorCode;
    @Column(name = "right_color_code")
    private Integer rightColorCode;
}
