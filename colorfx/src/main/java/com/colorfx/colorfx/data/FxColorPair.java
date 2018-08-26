package com.colorfx.colorfx.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class FxColorPair implements Serializable {

    private static final long serialVersionUID = 4678852901357132238L;

    private Integer code;
    private Integer leftColor;
    private Integer rightColor;
}
